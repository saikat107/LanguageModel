<METHOD_START> public void ( java.lang.String java.lang.String , java.lang.Object ... java.lang.Object[] ) { Assert . hasText ( java.lang.String , STRING ) ; this . java.lang.String = java.lang.String . java.lang.String ( java.lang.String , java.lang.Object[] ) ; this . org.springframework.test.util.JsonPath = JsonPath . compile ( this . java.lang.String ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > void void ( java.lang.String java.lang.String , Matcher < T > org.springframework.test.util.Matcher<T> ) { T T = ( T ) java.lang.Object ( java.lang.String ) ; assertThat ( STRING + this . java.lang.String + STRING , T , org.springframework.test.util.Matcher<T> ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) public < T > void void ( java.lang.String java.lang.String , Matcher < T > org.springframework.test.util.Matcher<T> , java.lang.Class<T> < T > java.lang.Class<T> ) { T T = ( T ) java.lang.Object ( java.lang.String , java.lang.Class<T> ) ; assertThat ( STRING + this . java.lang.String + STRING , T , org.springframework.test.util.Matcher<T> ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String ) ; if ( ( java.lang.Object instanceof java.util.List ) && ! ( java.lang.Object instanceof java.util.List ) ) { @ java.lang.SuppressWarnings ( STRING ) java.util.List java.util.List = ( java.util.List ) java.lang.Object ; if ( java.util.List . boolean ( ) ) { fail ( STRING + this . java.lang.String + STRING ) ; } if ( java.util.List . int ( ) != NUMBER ) { fail ( STRING + java.lang.Object + STRING + java.lang.Object ) ; } java.lang.Object = java.util.List . java.lang.Object ( NUMBER ) ; } else if ( java.lang.Object != null && java.lang.Object != null ) { if ( ! java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) . boolean ( java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ) { java.lang.Object = java.lang.Object ( java.lang.String , java.lang.Object . java.lang.Class<? extends java.lang.Object> ( ) ) ; } } assertEquals ( STRING + this . java.lang.String + STRING , java.lang.Object , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String ) ; assertThat ( java.lang.String ( STRING , java.lang.Object ) , java.lang.Object , instanceOf ( java.lang.String .class ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String ) ; assertThat ( java.lang.String ( STRING , java.lang.Object ) , java.lang.Object , instanceOf ( java.lang.Boolean .class ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String ) ; assertThat ( java.lang.String ( STRING , java.lang.Object ) , java.lang.Object , instanceOf ( java.lang.Number .class ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String ) ; assertThat ( java.lang.String ( STRING , java.lang.Object ) , java.lang.Object , instanceOf ( java.util.List .class ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String ) ; assertThat ( java.lang.String ( STRING , java.lang.Object ) , java.lang.Object , instanceOf ( java.util.Map .class ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.Object ( java.lang.String ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object ; try { java.lang.Object = java.lang.Object ( java.lang.String ) ; } catch ( java.lang.AssertionError java.lang.AssertionError ) { return; } java.lang.String java.lang.String = java.lang.String ( STRING , java.lang.Object ) ; if ( boolean ( ) && java.lang.Object instanceof java.util.List ) { assertTrue ( java.lang.String , ( ( java.util.List<?> < ? > ) java.lang.Object ) . boolean ( ) ) ; } else { assertTrue ( java.lang.String , ( java.lang.Object == null ) ) ; } }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String ) ; assertTrue ( java.lang.String ( STRING , java.lang.Object ) , ObjectUtils . isEmpty ( java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String ) ; assertTrue ( java.lang.String ( STRING , java.lang.Object ) , ! ObjectUtils . isEmpty ( java.lang.Object ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { return java.lang.String . java.lang.String ( STRING , java.lang.String , this . java.lang.String , ObjectUtils . nullSafeToString ( StringUtils . quoteIfString ( java.lang.Object ) ) ) ; }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { java.lang.String java.lang.String = STRING + this . java.lang.String + STRING ; try { return this . org.springframework.test.util.JsonPath . read ( java.lang.String ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.AssertionError ( java.lang.String , java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.String java.lang.String , java.lang.Class<?> < ? > java.lang.Class<?> ) { java.lang.String java.lang.String = STRING + this . java.lang.String + STRING ; try { return JsonPath . parse ( java.lang.String ) . read ( this . java.lang.String , java.lang.Class<> ) ; } catch ( java.lang.Throwable java.lang.Throwable ) { throw new java.lang.AssertionError ( java.lang.String , java.lang.Throwable ) ; } }  <METHOD_END>
<METHOD_START> private java.lang.Object java.lang.Object ( java.lang.String java.lang.String ) { java.lang.Object java.lang.Object = java.lang.Object ( java.lang.String ) ; java.lang.String java.lang.String = STRING + this . java.lang.String + STRING ; assertTrue ( java.lang.String , java.lang.Object != null ) ; if ( boolean ( ) && java.lang.Object instanceof java.util.List ) { assertTrue ( java.lang.String , ! ( ( java.util.List<?> < ? > ) java.lang.Object ) . boolean ( ) ) ; } return java.lang.Object ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { return ! this . org.springframework.test.util.JsonPath . isDefinite ( ) ; }  <METHOD_END>
