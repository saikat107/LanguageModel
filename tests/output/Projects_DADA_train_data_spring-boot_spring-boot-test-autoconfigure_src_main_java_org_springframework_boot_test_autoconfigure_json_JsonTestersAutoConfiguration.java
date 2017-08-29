<METHOD_START> @ Bean public static org.springframework.boot.test.autoconfigure.json.JsonTestersAutoConfiguration.JsonMarshalTestersBeanPostProcessor org.springframework.boot.test.autoconfigure.json.JsonTestersAutoConfiguration.JsonMarshalTestersBeanPostProcessor ( ) { return new org.springframework.boot.test.autoconfigure.json.JsonTestersAutoConfiguration.JsonMarshalTestersBeanPostProcessor ( ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) public org.springframework.boot.test.autoconfigure.json.FactoryBean<org.springframework.boot.test.autoconfigure.json.BasicJsonTester> < BasicJsonTester > org.springframework.boot.test.autoconfigure.json.FactoryBean<org.springframework.boot.test.autoconfigure.json.BasicJsonTester> ( ) { return new org.springframework.boot.test.autoconfigure.json.JsonTestersAutoConfiguration.JsonTesterFactoryBean<org.springframework.boot.test.autoconfigure.json.BasicJsonTester,java.lang.Void> < BasicJsonTester , java.lang.Void > ( BasicJsonTester .class , null ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) @ ConditionalOnBean ( ObjectMapper .class ) public org.springframework.boot.test.autoconfigure.json.FactoryBean<org.springframework.boot.test.autoconfigure.json.JacksonTester<?>> < JacksonTester < ? > > org.springframework.boot.test.autoconfigure.json.FactoryBean<org.springframework.boot.test.autoconfigure.json.JacksonTester<?>> ( ObjectMapper org.springframework.boot.test.autoconfigure.json.ObjectMapper ) { return new org.springframework.boot.test.autoconfigure.json.JsonTestersAutoConfiguration.JsonTesterFactoryBean <> ( JacksonTester .class , org.springframework.boot.test.autoconfigure.json.ObjectMapper ) ; }  <METHOD_END>
<METHOD_START> @ Bean @ Scope ( STRING ) @ ConditionalOnBean ( Gson .class ) public org.springframework.boot.test.autoconfigure.json.FactoryBean<org.springframework.boot.test.autoconfigure.json.GsonTester<?>> < GsonTester < ? > > org.springframework.boot.test.autoconfigure.json.FactoryBean<org.springframework.boot.test.autoconfigure.json.GsonTester<?>> ( Gson org.springframework.boot.test.autoconfigure.json.Gson ) { return new org.springframework.boot.test.autoconfigure.json.JsonTestersAutoConfiguration.JsonTesterFactoryBean <> ( GsonTester .class , org.springframework.boot.test.autoconfigure.json.Gson ) ; }  <METHOD_END>
<METHOD_START> void ( java.lang.Class<?> < ? > java.lang.Class<?> , M M ) { this . java.lang.Class<?> = java.lang.Class<> ; this . M = M ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override @ java.lang.SuppressWarnings ( STRING ) public T T ( ) java.lang.Exception { if ( this . M == null ) { java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> = this . java.lang.Class<> . java.lang.reflect.Constructor<> ( ) ; ReflectionUtils . makeAccessible ( java.lang.reflect.Constructor<> ) ; return ( T ) BeanUtils . instantiateClass ( java.lang.reflect.Constructor<> ) ; } java.lang.reflect.Constructor<?> < ? > [] java.lang.reflect.Constructor<?>[] = this . java.lang.Class<> . java.lang.reflect.Constructor<?>[] ( ) ; for ( java.lang.reflect.Constructor<?> < ? > java.lang.reflect.Constructor<?> : java.lang.reflect.Constructor<?>[] ) { if ( java.lang.reflect.Constructor<> . java.lang.Class<?>[] ( ) . int == NUMBER && java.lang.reflect.Constructor<> . java.lang.Class<?>[] ( ) [ NUMBER ] . boolean ( this . M ) ) { ReflectionUtils . makeAccessible ( java.lang.reflect.Constructor<> ) ; return ( T ) BeanUtils . instantiateClass ( java.lang.reflect.Constructor<> , this . M ) ; } } throw new java.lang.IllegalStateException ( this . java.lang.Class<> + STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<?> < ? > java.lang.Class<?> ( ) { return this . java.lang.Class<> ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Object java.lang.Object ( final java.lang.Object java.lang.Object , java.lang.String java.lang.String )				throws org.springframework.boot.test.autoconfigure.json.BeansException { ReflectionUtils . doWithFields ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , new FieldCallback ( ) { @ java.lang.Override public void void ( java.lang.reflect.Field java.lang.reflect.Field )						throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { void ( java.lang.Object , java.lang.reflect.Field ) ; } } ) ; return java.lang.Object ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.lang.reflect.Field java.lang.reflect.Field )						throws java.lang.IllegalArgumentException , java.lang.IllegalAccessException { void ( java.lang.Object , java.lang.reflect.Field ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.Object java.lang.Object , java.lang.reflect.Field java.lang.reflect.Field ) { if ( AbstractJsonMarshalTester .class . boolean ( java.lang.reflect.Field . java.lang.Class<?> ( ) ) || BasicJsonTester .class . boolean ( java.lang.reflect.Field . java.lang.Class<?> ( ) ) ) { ResolvableType org.springframework.boot.test.autoconfigure.json.ResolvableType = ResolvableType . forField ( java.lang.reflect.Field ) . getGeneric ( ) ; ReflectionUtils . makeAccessible ( java.lang.reflect.Field ) ; java.lang.Object java.lang.Object = ReflectionUtils . getField ( java.lang.reflect.Field , java.lang.Object ) ; if ( java.lang.Object != null ) { ReflectionTestUtils . invokeMethod ( java.lang.Object , STRING , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) , org.springframework.boot.test.autoconfigure.json.ResolvableType ) ; } } }  <METHOD_END>
