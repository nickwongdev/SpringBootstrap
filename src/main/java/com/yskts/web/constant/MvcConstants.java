package com.yskts.web.constant;

/**
 * MVC Constants for different views in the application.
 *
 * @author niwong
 * @since 3/29/13
 */
public class MvcConstants {

    /**
     * Constants for Hello World view.
     */
    public class HelloWorld {

        public static final String URL = "/helloworld";
        public static final String VIEW = "hello-world";
    }

    /**
     * Constants for Index view.
     */
    public class Index {

        public static final String URL = "/index";
        public static final String VIEW = "index";

        public class Model {

            public static final String GREETING = "greeting";
        }
    }
}
