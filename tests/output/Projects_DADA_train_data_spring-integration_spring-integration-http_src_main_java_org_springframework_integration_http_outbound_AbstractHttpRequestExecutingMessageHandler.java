<METHOD_START> public void ( Expression org.springframework.integration.http.outbound.Expression ) { Assert . notNull ( org.springframework.integration.http.outbound.Expression , STRING ) ; this . org.springframework.integration.http.outbound.Expression = org.springframework.integration.http.outbound.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.http.outbound.Expression ) { Assert . notNull ( org.springframework.integration.http.outbound.Expression , STRING ) ; this . org.springframework.integration.http.outbound.Expression = org.springframework.integration.http.outbound.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( HttpMethod org.springframework.integration.http.outbound.HttpMethod ) { Assert . notNull ( org.springframework.integration.http.outbound.HttpMethod , STRING ) ; this . org.springframework.integration.http.outbound.Expression = new ValueExpression < HttpMethod > ( org.springframework.integration.http.outbound.HttpMethod ) ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; this . boolean = true ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { Assert . isTrue ( java.nio.charset.Charset . boolean ( java.lang.String ) , STRING + java.lang.String + STRING ) ; this . java.nio.charset.Charset = java.nio.charset.Charset . java.nio.charset.Charset ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public boolean boolean ( ) { return this . boolean ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.Class<?> < ? > java.lang.Class<?> ) { Assert . notNull ( java.lang.Class<> , STRING ) ; this . org.springframework.integration.http.outbound.Expression = new ValueExpression < java.lang.Class<?> < ? > > ( java.lang.Class<> ) ; }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.http.outbound.Expression ) { this . org.springframework.integration.http.outbound.Expression = org.springframework.integration.http.outbound.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( HeaderMapper < HttpHeaders > org.springframework.integration.http.outbound.HeaderMapper<org.springframework.integration.http.outbound.HttpHeaders> ) { Assert . notNull ( org.springframework.integration.http.outbound.HeaderMapper<org.springframework.integration.http.outbound.HttpHeaders> , STRING ) ; this . org.springframework.integration.http.outbound.HeaderMapper<org.springframework.integration.http.outbound.HttpHeaders> = org.springframework.integration.http.outbound.HeaderMapper<org.springframework.integration.http.outbound.HttpHeaders> ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Map<java.lang.String,org.springframework.integration.http.outbound.Expression> < java.lang.String , Expression > java.util.Map<java.lang.String,org.springframework.integration.http.outbound.Expression> ) { synchronized ( this . java.util.Map<java.lang.String,org.springframework.integration.http.outbound.Expression> ) { this . java.util.Map<java.lang.String,org.springframework.integration.http.outbound.Expression> . clear ( ) ; this . java.util.Map<java.lang.String,org.springframework.integration.http.outbound.Expression> . putAll ( java.util.Map<java.lang.String,org.springframework.integration.http.outbound.Expression> ) ; } }  <METHOD_END>
<METHOD_START> public void void ( Expression org.springframework.integration.http.outbound.Expression ) { this . org.springframework.integration.http.outbound.Expression = org.springframework.integration.http.outbound.Expression ; }  <METHOD_END>
<METHOD_START> public void void ( boolean boolean ) { this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . org.springframework.integration.http.outbound.StandardEvaluationContext = ExpressionUtils . createStandardEvaluationContext ( this . getBeanFactory ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.http.outbound.Message<?> ) { HttpMethod org.springframework.integration.http.outbound.HttpMethod = org.springframework.integration.http.outbound.HttpMethod ( org.springframework.integration.http.outbound.Message<> ) ; if ( ! boolean ( org.springframework.integration.http.outbound.HttpMethod ) && this . boolean ) { if ( logger . isWarnEnabled ( ) ) { logger . warn ( STRING + STRING + org.springframework.integration.http.outbound.HttpMethod + STRING ) ; } } java.lang.Object java.lang.Object = java.lang.Object ( org.springframework.integration.http.outbound.Message<> ) ; HttpEntity < ? > org.springframework.integration.http.outbound.HttpEntity<?> = org.springframework.integration.http.outbound.HttpEntity<?> ( org.springframework.integration.http.outbound.Message<> , org.springframework.integration.http.outbound.HttpMethod ) ; return java.lang.Object ( ( ) generateUri ( requestMessage ) , org.springframework.integration.http.outbound.HttpMethod , org.springframework.integration.http.outbound.HttpEntity<> , java.lang.Object , org.springframework.integration.http.outbound.Message<> ) ; }  <METHOD_END>
<METHOD_START> protected abstract java.lang.Object java.lang.Object ( java.util.function.Supplier<java.net.URI> < java.net.URI > java.util.function.Supplier<java.net.URI> , HttpMethod org.springframework.integration.http.outbound.HttpMethod , HttpEntity < ? > org.springframework.integration.http.outbound.HttpEntity<?> , java.lang.Object java.lang.Object , Message < ? > org.springframework.integration.http.outbound.Message<?> );  <METHOD_END>
<METHOD_START> private java.net.URI java.net.URI ( Message < ? > org.springframework.integration.http.outbound.Message<?> ) { java.lang.Object java.lang.Object = this . org.springframework.integration.http.outbound.Expression . getValue ( this . org.springframework.integration.http.outbound.StandardEvaluationContext , org.springframework.integration.http.outbound.Message<> ) ; Assert . state ( java.lang.Object instanceof java.lang.String || java.lang.Object instanceof java.net.URI , STRING + ( java.lang.Object == null ? STRING : java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) ; java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> = java.util.Map<java.lang.String,?> ( org.springframework.integration.http.outbound.Message<> ) ; UriComponentsBuilder org.springframework.integration.http.outbound.UriComponentsBuilder = java.lang.Object instanceof java.lang.String ? UriComponentsBuilder . fromUriString ( ( java.lang.String ) java.lang.Object ) : UriComponentsBuilder . fromUri ( ( java.net.URI ) java.lang.Object ) ; UriComponents org.springframework.integration.http.outbound.UriComponents = org.springframework.integration.http.outbound.UriComponentsBuilder . buildAndExpand ( java.util.Map<java.lang.String,> ) ; try { return this . boolean ? org.springframework.integration.http.outbound.UriComponents . toUri ( ) : new java.net.URI ( org.springframework.integration.http.outbound.UriComponents . toUriString ( ) ) ; } catch ( java.net.URISyntaxException java.net.URISyntaxException ) { throw new MessageHandlingException ( org.springframework.integration.http.outbound.Message<> , STRING + java.lang.Object + STRING , java.net.URISyntaxException ) ; } }  <METHOD_END>
<METHOD_START> protected java.lang.Object java.lang.Object ( ResponseEntity < ? > org.springframework.integration.http.outbound.ResponseEntity<?> ) { if ( this . boolean ) { HttpHeaders org.springframework.integration.http.outbound.HttpHeaders = org.springframework.integration.http.outbound.ResponseEntity<> . getHeaders ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = this . org.springframework.integration.http.outbound.HeaderMapper<org.springframework.integration.http.outbound.HttpHeaders> . toHeaders ( org.springframework.integration.http.outbound.HttpHeaders ) ; if ( this . boolean ) { this . void ( java.util.Map<java.lang.String,java.lang.Object> ) ; } AbstractIntegrationMessageBuilder < ? > org.springframework.integration.http.outbound.AbstractIntegrationMessageBuilder<?> = null ; MessageBuilderFactory org.springframework.integration.http.outbound.MessageBuilderFactory = getMessageBuilderFactory ( ) ; if ( org.springframework.integration.http.outbound.ResponseEntity<> . hasBody ( ) ) { java.lang.Object java.lang.Object = org.springframework.integration.http.outbound.ResponseEntity<> . getBody ( ) ; org.springframework.integration.http.outbound.AbstractIntegrationMessageBuilder<?> = ( java.lang.Object instanceof Message < ? > ) ? org.springframework.integration.http.outbound.MessageBuilderFactory . fromMessage ( ( Message < ? > ) java.lang.Object ) : org.springframework.integration.http.outbound.MessageBuilderFactory . withPayload ( java.lang.Object ) ; } else { org.springframework.integration.http.outbound.AbstractIntegrationMessageBuilder<?> = org.springframework.integration.http.outbound.MessageBuilderFactory . withPayload ( org.springframework.integration.http.outbound.ResponseEntity<> ) ; } org.springframework.integration.http.outbound.AbstractIntegrationMessageBuilder<> . setHeader ( org . springframework . integration . http . HttpHeaders . STATUS_CODE , org.springframework.integration.http.outbound.ResponseEntity<> . getStatusCode ( ) ) ; return org.springframework.integration.http.outbound.AbstractIntegrationMessageBuilder<> . copyHeaders ( java.util.Map<java.lang.String,java.lang.Object> ) ; } return null ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { java.lang.String java.lang.String = null ; for ( java.lang.String java.lang.String : java.util.Map<java.lang.String,java.lang.Object> . java.util.Set<java.lang.String> ( ) ) { if ( java.lang.String . boolean ( DefaultHttpHeaderMapper . SET_COOKIE ) ) { java.lang.String = java.lang.String ; break; } } if ( java.lang.String != null ) { java.lang.Object java.lang.Object = java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( java.lang.String ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( DefaultHttpHeaderMapper . COOKIE , java.lang.Object ) ; if ( logger . isDebugEnabled ( ) ) { logger . debug ( STRING + java.lang.Object ) ; } } }  <METHOD_END>
<METHOD_START> private org.springframework.integration.http.outbound.HttpEntity<?> < ? > org.springframework.integration.http.outbound.HttpEntity<?> ( Message < ? > org.springframework.integration.http.outbound.Message<?> , HttpMethod org.springframework.integration.http.outbound.HttpMethod ) { Assert . notNull ( org.springframework.integration.http.outbound.Message<> , STRING ) ; return ( this . boolean ) ? this . org.springframework.integration.http.outbound.HttpEntity<?> ( org.springframework.integration.http.outbound.Message<> , org.springframework.integration.http.outbound.HttpMethod ) : this . org.springframework.integration.http.outbound.HttpEntity<?> ( org.springframework.integration.http.outbound.Message<> , org.springframework.integration.http.outbound.HttpMethod ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.http.outbound.HttpEntity<?> < ? > org.springframework.integration.http.outbound.HttpEntity<?> ( Message < ? > org.springframework.integration.http.outbound.Message<?> , HttpMethod org.springframework.integration.http.outbound.HttpMethod ) { java.lang.Object java.lang.Object = org.springframework.integration.http.outbound.Message<> . getPayload ( ) ; if ( java.lang.Object instanceof HttpEntity < ? > ) { return ( HttpEntity < ? > ) java.lang.Object ; } HttpHeaders org.springframework.integration.http.outbound.HttpHeaders = this . org.springframework.integration.http.outbound.HttpHeaders ( org.springframework.integration.http.outbound.Message<> ) ; if ( ! boolean ( org.springframework.integration.http.outbound.HttpMethod ) ) { return new HttpEntity <> ( org.springframework.integration.http.outbound.HttpHeaders ) ; } if ( org.springframework.integration.http.outbound.HttpHeaders . getContentType ( ) == null ) { MediaType org.springframework.integration.http.outbound.MediaType = ( java.lang.Object instanceof java.lang.String ) ? org.springframework.integration.http.outbound.MediaType ( ( java.lang.String ) java.lang.Object , this . java.nio.charset.Charset ) : org.springframework.integration.http.outbound.MediaType ( java.lang.Object ) ; org.springframework.integration.http.outbound.HttpHeaders . setContentType ( org.springframework.integration.http.outbound.MediaType ) ; } if ( MediaType . APPLICATION_FORM_URLENCODED . equals ( org.springframework.integration.http.outbound.HttpHeaders . getContentType ( ) ) || MediaType . MULTIPART_FORM_DATA . equals ( org.springframework.integration.http.outbound.HttpHeaders . getContentType ( ) ) ) { if ( ! ( java.lang.Object instanceof MultiValueMap ) ) { java.lang.Object = this . org.springframework.integration.http.outbound.MultiValueMap<java.lang.Object,java.lang.Object> ( ( java.util.Map<?,?> < ? , ? > ) java.lang.Object ) ; } } return new HttpEntity <> ( java.lang.Object , org.springframework.integration.http.outbound.HttpHeaders ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.http.outbound.HttpEntity<?> < ? > org.springframework.integration.http.outbound.HttpEntity<?> ( Message < ? > org.springframework.integration.http.outbound.Message<?> , HttpMethod org.springframework.integration.http.outbound.HttpMethod ) { HttpHeaders org.springframework.integration.http.outbound.HttpHeaders = org.springframework.integration.http.outbound.HttpHeaders ( org.springframework.integration.http.outbound.Message<> ) ; if ( boolean ( org.springframework.integration.http.outbound.HttpMethod ) ) { org.springframework.integration.http.outbound.HttpHeaders . setContentType ( new MediaType ( STRING , STRING ) ) ; return new HttpEntity < java.lang.Object > ( org.springframework.integration.http.outbound.Message<> , org.springframework.integration.http.outbound.HttpHeaders ) ; } return new HttpEntity <> ( org.springframework.integration.http.outbound.HttpHeaders ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.integration.http.outbound.HttpHeaders org.springframework.integration.http.outbound.HttpHeaders ( Message < ? > org.springframework.integration.http.outbound.Message<?> ) { HttpHeaders org.springframework.integration.http.outbound.HttpHeaders = new HttpHeaders ( ) ; this . org.springframework.integration.http.outbound.HeaderMapper<org.springframework.integration.http.outbound.HttpHeaders> . fromHeaders ( org.springframework.integration.http.outbound.Message<> . getHeaders ( ) , org.springframework.integration.http.outbound.HttpHeaders ) ; return org.springframework.integration.http.outbound.HttpHeaders ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private org.springframework.integration.http.outbound.MediaType org.springframework.integration.http.outbound.MediaType ( java.lang.Object java.lang.Object ) { MediaType org.springframework.integration.http.outbound.MediaType = null ; if ( java.lang.Object instanceof byte [] ) { org.springframework.integration.http.outbound.MediaType = MediaType . APPLICATION_OCTET_STREAM ; } else if ( java.lang.Object instanceof javax.xml.transform.Source ) { org.springframework.integration.http.outbound.MediaType = MediaType . TEXT_XML ; } else if ( java.lang.Object instanceof java.util.Map ) { if ( this . boolean ( ( java.util.Map<java.lang.Object,?> < java.lang.Object , ? > ) java.lang.Object ) ) { if ( this . boolean ( ( java.util.Map<java.lang.String,?> < java.lang.String , ? > ) java.lang.Object ) ) { org.springframework.integration.http.outbound.MediaType = MediaType . MULTIPART_FORM_DATA ; } else { org.springframework.integration.http.outbound.MediaType = MediaType . APPLICATION_FORM_URLENCODED ; } } } if ( org.springframework.integration.http.outbound.MediaType == null ) { org.springframework.integration.http.outbound.MediaType = new MediaType ( STRING , STRING ) ; } return org.springframework.integration.http.outbound.MediaType ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( HttpMethod org.springframework.integration.http.outbound.HttpMethod ) { return ! ( CollectionUtils . containsInstance ( java.util.List<org.springframework.integration.http.outbound.HttpMethod> , org.springframework.integration.http.outbound.HttpMethod ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.http.outbound.MediaType org.springframework.integration.http.outbound.MediaType ( java.lang.String java.lang.String , java.nio.charset.Charset java.nio.charset.Charset ) { return new MediaType ( STRING , STRING , java.nio.charset.Charset ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.http.outbound.MultiValueMap<java.lang.Object,java.lang.Object> < java.lang.Object , java.lang.Object > org.springframework.integration.http.outbound.MultiValueMap<java.lang.Object,java.lang.Object> ( java.util.Map<?,?> < ? , ? > java.util.Map<?,?> ) { LinkedMultiValueMap < java.lang.Object , java.lang.Object > org.springframework.integration.http.outbound.LinkedMultiValueMap<java.lang.Object,java.lang.Object> = new LinkedMultiValueMap < java.lang.Object , java.lang.Object > ( ) ; for ( java.util.Map.Entry<?,?> < ? , ? > java.util.Map.Entry<?,?> : java.util.Map<,> . java.util.Set<java.util.Map.Entry<,>> ( ) ) { java.lang.Object java.lang.Object = java.util.Map.Entry<,> . getKey ( ) ; java.lang.Object java.lang.Object = java.util.Map.Entry<,> . getValue ( ) ; if ( java.lang.Object instanceof java.lang.Object [] ) { java.lang.Object = java.util.Arrays . java.util.List<java.lang.Object> ( ( java.lang.Object [] ) java.lang.Object ) ; } if ( java.lang.Object instanceof java.util.Collection ) { org.springframework.integration.http.outbound.LinkedMultiValueMap<java.lang.Object,java.lang.Object> . put ( java.lang.Object , new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( ( java.util.Collection<?> < ? > ) java.lang.Object ) ) ; } else { org.springframework.integration.http.outbound.LinkedMultiValueMap<java.lang.Object,java.lang.Object> . add ( java.lang.Object , java.lang.Object ) ; } } return org.springframework.integration.http.outbound.LinkedMultiValueMap<java.lang.Object,java.lang.Object> ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ) { for ( java.lang.Object java.lang.Object : java.util.Map<java.lang.String,> . java.util.Collection<> ( ) ) { if ( java.lang.Object != null ) { if ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( ) ) { java.lang.Object = CollectionUtils . arrayToList ( java.lang.Object ) ; } if ( java.lang.Object instanceof java.util.Collection ) { java.util.Collection<?> < ? > java.util.Collection<?> = ( java.util.Collection<?> < ? > ) java.lang.Object ; for ( java.lang.Object java.lang.Object : java.util.Collection<> ) { if ( java.lang.Object != null && ! ( java.lang.Object instanceof java.lang.String ) ) { return true ; } } } else if ( ! ( java.lang.Object instanceof java.lang.String ) ) { return true ; } } } return false ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( java.util.Map<java.lang.Object,?> < java.lang.Object , ? > java.util.Map<java.lang.Object,?> ) { for ( java.lang.Object java.lang.Object : java.util.Map<java.lang.Object,> . java.util.Set<java.lang.Object> ( ) ) { if ( ! ( java.lang.Object instanceof java.lang.String ) ) { return false ; } } return true ; }  <METHOD_END>
<METHOD_START> private org.springframework.integration.http.outbound.HttpMethod org.springframework.integration.http.outbound.HttpMethod ( Message < ? > org.springframework.integration.http.outbound.Message<?> ) { java.lang.Object java.lang.Object = this . org.springframework.integration.http.outbound.Expression . getValue ( this . org.springframework.integration.http.outbound.StandardEvaluationContext , org.springframework.integration.http.outbound.Message<> ) ; Assert . state ( java.lang.Object != null && ( java.lang.Object instanceof java.lang.String || java.lang.Object instanceof HttpMethod ) , STRING + STRING + ( java.lang.Object == null ? STRING : java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) ; if ( java.lang.Object instanceof HttpMethod ) { return ( HttpMethod ) java.lang.Object ; } else { try { return HttpMethod . valueOf ( ( java.lang.String ) java.lang.Object ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Object ) ; } } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( Message < ? > org.springframework.integration.http.outbound.Message<?> ) { java.lang.Object java.lang.Object = null ; if ( this . org.springframework.integration.http.outbound.Expression != null ) { java.lang.Object = this . org.springframework.integration.http.outbound.Expression . getValue ( this . org.springframework.integration.http.outbound.StandardEvaluationContext , org.springframework.integration.http.outbound.Message<> ) ; } if ( java.lang.Object != null ) { Assert . state ( java.lang.Object instanceof java.lang.Class<?> < ? > || java.lang.Object instanceof java.lang.String || java.lang.Object instanceof ParameterizedTypeReference , STRING + STRING + STRING + java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) + STRING ) ; if ( java.lang.Object instanceof java.lang.String && StringUtils . hasText ( ( java.lang.String ) java.lang.Object ) ) { try { java.lang.Object = ClassUtils . forName ( ( java.lang.String ) java.lang.Object , getApplicationContext ( ) . getClassLoader ( ) ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { throw new java.lang.IllegalStateException ( STRING + java.lang.Object , java.lang.ClassNotFoundException ) ; } } } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ( Message < ? > org.springframework.integration.http.outbound.Message<?> ) { java.util.Map<java.lang.String,?> < java.lang.String , ? > java.util.Map<java.lang.String,?> ; if ( this . org.springframework.integration.http.outbound.Expression != null ) { java.lang.Object java.lang.Object = this . org.springframework.integration.http.outbound.Expression . getValue ( this . org.springframework.integration.http.outbound.StandardEvaluationContext , org.springframework.integration.http.outbound.Message<> ) ; Assert . state ( java.lang.Object instanceof java.util.Map , STRING ) ; java.util.Map<java.lang.String,?> = ( java.util.Map<java.lang.String,?> < java.lang.String , ? > ) java.lang.Object ; } else { java.util.Map<java.lang.String,?> = this . java.util.Map<java.lang.String,org.springframework.integration.http.outbound.Expression> ; } return ExpressionEvalMap . from ( java.util.Map<java.lang.String,> ) . usingEvaluationContext ( this . org.springframework.integration.http.outbound.StandardEvaluationContext ) . withRoot ( org.springframework.integration.http.outbound.Message<> ) . build ( ) ; }  <METHOD_END>