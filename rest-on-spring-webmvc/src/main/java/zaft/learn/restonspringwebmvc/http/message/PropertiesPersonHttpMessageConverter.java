package zaft.learn.restonspringwebmvc.http.message;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import zaft.learn.restonspringwebmvc.domain.Person;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Properties;

/**
 * @ClassName PropertiesPersonHttpMessageConverter
 * @Description: TODO
 * @Author zaft_x
 * @Date 2019/11/22 0022
 * @Version V1.0
 **/
public class PropertiesPersonHttpMessageConverter extends AbstractHttpMessageConverter<Person> {

    public PropertiesPersonHttpMessageConverter(){
        super(MediaType.valueOf("application/properties+person"));
        setDefaultCharset(Charset.forName("UTF-8"));
    }


    @Override
    protected boolean supports(Class clazz) {
        return clazz.isAssignableFrom(Person.class);
    }

    @Override
    protected Person readInternal(Class<? extends Person> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        InputStream inputStream = inputMessage.getBody();
        Person person = new Person();
        Properties properties = new Properties();
        properties.load(new InputStreamReader(inputStream, getDefaultCharset()));
        person.setId(Long.valueOf(properties.getProperty("person.id")));
        person.setName(properties.getProperty("person.name"));

        return person;
    }

    @Override
    protected void writeInternal(Person person, HttpOutputMessage outputMessage) throws IOException, HttpMessageNotWritableException {
        OutputStream outputStream = outputMessage.getBody();
        Properties properties = new Properties();
        properties.setProperty("person.id",String.valueOf(person.getId()));
        properties.setProperty("person.name",person.getName());

        properties.store(new OutputStreamWriter(outputStream,getDefaultCharset()),"Written by web server");
    }
}
