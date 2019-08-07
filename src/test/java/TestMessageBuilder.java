import org.junit.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class TestMessageBuilder {
    @Test
    public void test(){
        MessageBuilder messageBuilder = new MessageBuilder();
        Assert.assertEquals("hello",messageBuilder.getMessage("hello"));
    }

    @Test
    public void test2() throws ParseException {
        Calendar c = Calendar.getInstance();
        new SimpleDateFormat("YYYYMMdd").parse("19921200");
    }

}