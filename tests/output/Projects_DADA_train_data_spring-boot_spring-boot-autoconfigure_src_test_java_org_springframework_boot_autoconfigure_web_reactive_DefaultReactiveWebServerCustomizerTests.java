<METHOD_START> @ Before public void void ( ) java.lang.Exception { this . org.springframework.boot.autoconfigure.web.reactive.DefaultReactiveWebServerCustomizer = new DefaultReactiveWebServerCustomizer ( this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableReactiveWebServerFactory org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory = mock ( ConfigurableReactiveWebServerFactory .class ) ; this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . setPort ( NUMBER ) ; this . org.springframework.boot.autoconfigure.web.reactive.DefaultReactiveWebServerCustomizer . customize ( org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory ) ; verify ( org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory ) . setPort ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { ConfigurableReactiveWebServerFactory org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory = mock ( ConfigurableReactiveWebServerFactory .class ) ; java.net.InetAddress java.net.InetAddress = mock ( java.net.InetAddress .class ) ; this . org.springframework.boot.autoconfigure.web.reactive.ServerProperties . setAddress ( java.net.InetAddress ) ; this . org.springframework.boot.autoconfigure.web.reactive.DefaultReactiveWebServerCustomizer . customize ( org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory ) ; verify ( org.springframework.boot.autoconfigure.web.reactive.ConfigurableReactiveWebServerFactory ) . setAddress ( java.net.InetAddress ) ; }  <METHOD_END>