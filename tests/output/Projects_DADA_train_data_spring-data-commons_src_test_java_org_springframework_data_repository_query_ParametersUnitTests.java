<METHOD_START> @ Before public void void ( ) java.lang.SecurityException , java.lang.NoSuchMethodException { java.lang.reflect.Method = org.springframework.data.repository.query.ParametersUnitTests.SampleDao .class . java.lang.reflect.Method ( STRING , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.repository.query.ParametersUnitTests.SampleDao .class . java.lang.reflect.Method ( STRING , java.lang.String .class , Pageable .class ) ; java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.repository.query.ParametersUnitTests.SampleDao .class . java.lang.reflect.Method ( STRING , java.lang.String .class , Sort .class ) ; new DefaultParameters ( java.lang.reflect.Method ) ; new DefaultParameters ( java.lang.reflect.Method ) ; new DefaultParameters ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.repository.query.ParametersUnitTests.SampleDao .class . java.lang.reflect.Method ( STRING , java.lang.String .class , java.lang.String .class ) ; new DefaultParameters ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new DefaultParameters ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameters < ? , ? > org.springframework.data.repository.query.Parameters<?,?> = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , java.lang.String .class , Sort .class ) ; Parameter org.springframework.data.repository.query.Parameter = org.springframework.data.repository.query.Parameters<,> . getParameter ( NUMBER ) ; assertThat ( org.springframework.data.repository.query.Parameter . isNamedParameter ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.repository.query.Parameter . getPlaceholder ( ) ) . isEqualTo ( STRING ) ; org.springframework.data.repository.query.Parameter = org.springframework.data.repository.query.Parameters<,> . getParameter ( NUMBER ) ; assertThat ( org.springframework.data.repository.query.Parameter . isNamedParameter ( ) ) . isFalse ( ) ; assertThat ( org.springframework.data.repository.query.Parameter . isSpecialParameter ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.repository.query.ParametersUnitTests.SampleDao .class . java.lang.reflect.Method ( STRING , Sort .class , java.lang.String .class ) ; Parameters < ? , ? > org.springframework.data.repository.query.Parameters<?,?> = new DefaultParameters ( java.lang.reflect.Method ) ; assertThat ( org.springframework.data.repository.query.Parameters<,> . getBindableParameter ( NUMBER ) . getIndex ( ) ) . isEqualTo ( NUMBER ) ; java.lang.reflect.Method = org.springframework.data.repository.query.ParametersUnitTests.SampleDao .class . java.lang.reflect.Method ( STRING , java.lang.String .class , Sort .class , java.lang.String .class ) ; org.springframework.data.repository.query.Parameters<?,?> = new DefaultParameters ( java.lang.reflect.Method ) ; assertThat ( org.springframework.data.repository.query.Parameters<,> . getBindableParameter ( NUMBER ) . getIndex ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( org.springframework.data.repository.query.Parameters<,> . getBindableParameter ( NUMBER ) . getIndex ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameters < ? , ? > org.springframework.data.repository.query.Parameters<?,?> = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING ) ; assertThat ( org.springframework.data.repository.query.Parameters<,> . hasParameterAt ( NUMBER ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameters < ? , ? > org.springframework.data.repository.query.Parameters<?,?> = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , java.lang.String .class , Pageable .class ) ; assertThat ( org.springframework.data.repository.query.Parameters<,> . getPageableIndex ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameters < ? , ? > org.springframework.data.repository.query.Parameters<?,?> = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , java.lang.String .class , Sort .class ) ; assertThat ( org.springframework.data.repository.query.Parameters<,> . getSortIndex ( ) ) . isEqualTo ( NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , Pageable .class , java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameter org.springframework.data.repository.query.Parameter = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , java.lang.String .class ) . getBindableParameter ( NUMBER ) ; assertThat ( org.springframework.data.repository.query.Parameter . getName ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.repository.query.Parameter . isExplicitlyNamed ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameter org.springframework.data.repository.query.Parameter = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , Sort .class , java.lang.String .class ) . getBindableParameter ( NUMBER ) ; java.lang.Object java.lang.Object = ReflectionTestUtils . getField ( org.springframework.data.repository.query.Parameter , STRING ) ; ReflectionTestUtils . setField ( java.lang.Object , STRING , STRING ) ; assertThat ( org.springframework.data.repository.query.Parameter . getName ( ) ) . isNotNull ( ) ; assertThat ( org.springframework.data.repository.query.Parameter . isExplicitlyNamed ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameters < ? , Parameter > org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , java.lang.Class .class , java.lang.Class .class , java.lang.Class .class ) ; assertThat ( org.springframework.data.repository.query.Parameters<,org.springframework.data.repository.query.Parameter> . getParameter ( NUMBER ) . isDynamicProjectionParameter ( ) ) . isTrue ( ) ; assertThat ( org.springframework.data.repository.query.Parameters<,org.springframework.data.repository.query.Parameter> . getParameter ( NUMBER ) . isDynamicProjectionParameter ( ) ) . isFalse ( ) ; assertThat ( org.springframework.data.repository.query.Parameters<,org.springframework.data.repository.query.Parameter> . getParameter ( NUMBER ) . isDynamicProjectionParameter ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameters < ? , Parameter > org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , java.util.Optional .class ) ; assertThat ( org.springframework.data.repository.query.Parameters<,org.springframework.data.repository.query.Parameter> . getParameter ( NUMBER ) . getType ( ) ) . isEqualTo ( java.lang.String .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameters < ? , Parameter > org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , Publisher .class ) ; assertThat ( org.springframework.data.repository.query.Parameters<,org.springframework.data.repository.query.Parameter> . getParameter ( NUMBER ) . getType ( ) ) . isAssignableFrom ( Publisher .class ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Parameters < ? , Parameter > org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> = org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( STRING , Single .class ) ; assertThat ( org.springframework.data.repository.query.Parameters<,org.springframework.data.repository.query.Parameter> . getParameter ( NUMBER ) . getType ( ) ) . isAssignableFrom ( Single .class ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> < ? , Parameter > org.springframework.data.repository.query.Parameters<?,org.springframework.data.repository.query.Parameter> ( java.lang.String java.lang.String , java.lang.Class<?> < ? > ... java.lang.Class<?>[] )			throws java.lang.SecurityException , java.lang.NoSuchMethodException { java.lang.reflect.Method java.lang.reflect.Method = org.springframework.data.repository.query.ParametersUnitTests.SampleDao .class . java.lang.reflect.Method ( java.lang.String , java.lang.Class<?>[] ) ; return new DefaultParameters ( java.lang.reflect.Method ) ; }  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ParametersUnitTests.User org.springframework.data.repository.query.ParametersUnitTests.User ( @ Param ( STRING ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ParametersUnitTests.User org.springframework.data.repository.query.ParametersUnitTests.User ( @ Param ( STRING ) java.lang.String java.lang.String , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ParametersUnitTests.User org.springframework.data.repository.query.ParametersUnitTests.User ( @ Param ( STRING ) java.lang.String java.lang.String , Pageable org.springframework.data.repository.query.Pageable );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ParametersUnitTests.User org.springframework.data.repository.query.ParametersUnitTests.User ( Pageable org.springframework.data.repository.query.Pageable , @ Param ( STRING ) java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ParametersUnitTests.User org.springframework.data.repository.query.ParametersUnitTests.User ( @ Param ( STRING ) java.lang.String java.lang.String , Sort org.springframework.data.repository.query.Sort );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ParametersUnitTests.User org.springframework.data.repository.query.ParametersUnitTests.User ( Sort org.springframework.data.repository.query.Sort , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ParametersUnitTests.User org.springframework.data.repository.query.ParametersUnitTests.User ( java.lang.String java.lang.String , Sort org.springframework.data.repository.query.Sort , java.lang.String java.lang.String );  <METHOD_END>
<METHOD_START> org.springframework.data.repository.query.ParametersUnitTests.User org.springframework.data.repository.query.ParametersUnitTests.User ( )  <METHOD_END>
<METHOD_START> < T > T T ( java.lang.Class<T> < T > java.lang.Class<T> , java.lang.Class<?> < ? > java.lang.Class<?> , java.lang.Class<java.lang.Object> < java.lang.Object > java.lang.Class<java.lang.Object> );  <METHOD_END>
<METHOD_START> void void ( java.util.Optional<java.lang.String> < java.lang.String > java.util.Optional<java.lang.String> );  <METHOD_END>
<METHOD_START> void void ( Publisher < java.lang.String > org.springframework.data.repository.query.Publisher<java.lang.String> );  <METHOD_END>
<METHOD_START> void void ( Single < java.lang.String > org.springframework.data.repository.query.Single<java.lang.String> );  <METHOD_END>
