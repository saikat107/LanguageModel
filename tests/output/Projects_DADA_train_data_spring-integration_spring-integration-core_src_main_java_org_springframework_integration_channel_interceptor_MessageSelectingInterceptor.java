<METHOD_START> public void ( MessageSelector ... org.springframework.integration.channel.interceptor.MessageSelector[] ) { this . java.util.List<org.springframework.integration.channel.interceptor.MessageSelector> = java.util.Arrays . java.util.List ( org.springframework.integration.channel.interceptor.MessageSelector[] ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.integration.channel.interceptor.Message<?> < ? > org.springframework.integration.channel.interceptor.Message<?> ( Message < ? > org.springframework.integration.channel.interceptor.Message<?> , MessageChannel org.springframework.integration.channel.interceptor.MessageChannel ) { for ( MessageSelector org.springframework.integration.channel.interceptor.MessageSelector : this . java.util.List<org.springframework.integration.channel.interceptor.MessageSelector> ) { if ( ! org.springframework.integration.channel.interceptor.MessageSelector . accept ( org.springframework.integration.channel.interceptor.Message<> ) ) { throw new MessageDeliveryException ( org.springframework.integration.channel.interceptor.Message<> , STRING + org.springframework.integration.channel.interceptor.MessageSelector + STRING ) ; } } return org.springframework.integration.channel.interceptor.Message<> ; }  <METHOD_END>