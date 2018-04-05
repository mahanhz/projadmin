package ut.com.example.projadmin;

import org.junit.Test;
import com.example.projadmin.api.MyPluginComponent;
import com.example.projadmin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}