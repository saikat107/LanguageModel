<METHOD_START> @ java.lang.Override public boolean boolean ( MethodParameter org.springframework.integration.handler.support.MethodParameter ) { return ! org.springframework.integration.handler.support.MethodParameter . hasParameterAnnotation ( Payload .class ) && java.util.Map .class . boolean ( org.springframework.integration.handler.support.MethodParameter . getParameterType ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public java.lang.Object java.lang.Object ( MethodParameter org.springframework.integration.handler.support.MethodParameter , Message < ? > org.springframework.integration.handler.support.Message<?> ) throws java.lang.Exception { java.lang.Object java.lang.Object = org.springframework.integration.handler.support.Message<> . getPayload ( ) ; if ( java.util.Properties .class . boolean ( org.springframework.integration.handler.support.MethodParameter . getParameterType ( ) ) ) { java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = org.springframework.integration.handler.support.Message<> . getHeaders ( ) ; if ( ! org.springframework.integration.handler.support.MethodParameter . hasParameterAnnotation ( Headers .class ) ) { if ( java.lang.Object instanceof java.util.Map ) { java.util.Map<java.lang.String,java.lang.Object> = ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > ) java.lang.Object ; } else if ( java.lang.Object instanceof java.lang.String && ( ( java.lang.String ) java.lang.Object ) . boolean ( STRING ) ) { return getEvaluationContext ( ) . getTypeConverter ( ) . convertValue ( java.lang.Object , TypeDescriptor . valueOf ( java.lang.String .class ) , org.springframework.integration.handler.support.TypeDescriptor ) ; } } java.util.Properties java.util.Properties = new java.util.Properties ( ) ; java.util.Properties . void ( java.util.Map<java.lang.String,java.lang.Object> ) ; return java.util.Properties ; } else { if ( ! org.springframework.integration.handler.support.MethodParameter . hasParameterAnnotation ( Headers .class ) && java.lang.Object instanceof java.util.Map ) { return java.lang.Object ; } else { return org.springframework.integration.handler.support.Message<> . getHeaders ( ) ; } } }  <METHOD_END>
