<METHOD_START> @ Test public void void ( ) { assertEquals ( NUMBER , org.springframework.test.context.web.socket.ServerContainer . getDefaultMaxTextMessageBufferSize ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Bean org.springframework.test.context.web.socket.ServletServerContainerFactoryBean org.springframework.test.context.web.socket.ServletServerContainerFactoryBean ( ) { ServletServerContainerFactoryBean org.springframework.test.context.web.socket.ServletServerContainerFactoryBean = new ServletServerContainerFactoryBean ( ) ; org.springframework.test.context.web.socket.ServletServerContainerFactoryBean . setMaxTextMessageBufferSize ( NUMBER ) ; return org.springframework.test.context.web.socket.ServletServerContainerFactoryBean ; }  <METHOD_END>