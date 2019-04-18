package aos.patterns;

import aos.builder.PersonWithAnnotations;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBuilder {


    @Before
    public void init(){

    }
    @After
    public void end(){

    }
    @Test
    public void testBuilderLombok(){
        PersonWithAnnotations t = PersonWithAnnotations.builder().firstName("123").lastName("test").build();
    }
}
