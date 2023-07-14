package com.thoughtworks.rectangle;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RectangleTest {

    @Test
    public void testArea() {
        final Rectangle rectangle = new Rectangle(5, 6);
        
        int expectedArea = 30;
        int actualArea = rectangle.area();
        Assertions.assertEquals(expectedArea, actualArea);
    }

}