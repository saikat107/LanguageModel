<METHOD_START> @ Test public void void ( ) { PublishSubscribeChannel org.springframework.integration.channel.PublishSubscribeChannel = new PublishSubscribeChannel ( mock ( java.util.concurrent.Executor .class ) ) ; try { org.springframework.integration.channel.PublishSubscribeChannel . subscribe ( m -> { } ) ; org.springframework.integration.channel.PublishSubscribeChannel . setBeanFactory ( mock ( BeanFactory .class ) ) ; org.springframework.integration.channel.PublishSubscribeChannel . afterPropertiesSet ( ) ; fail ( STRING ) ; } catch ( java.lang.IllegalStateException java.lang.IllegalStateException ) { assertThat ( java.lang.IllegalStateException . java.lang.String ( ) , equalTo ( STRING + STRING ) ) ; } }  <METHOD_END>
