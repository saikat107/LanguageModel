<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.MockMvc . perform ( get ( STRING ) ) . andExpect ( header ( ) . doesNotExist ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.ExpectedException . expect ( NoSuchBeanDefinitionException .class ) ; this . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.ApplicationContext . getBean ( WebDriver .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.ExpectedException . expect ( NoSuchBeanDefinitionException .class ) ; this . org.springframework.boot.test.autoconfigure.web.servlet.mockmvc.ApplicationContext . getBean ( WebClient .class ) ; }  <METHOD_END>
