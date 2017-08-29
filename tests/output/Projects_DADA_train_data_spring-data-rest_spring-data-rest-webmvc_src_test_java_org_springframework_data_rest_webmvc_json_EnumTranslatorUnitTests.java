<METHOD_START> @ Before public void void ( ) { LocaleContextHolder . setLocale ( java.util.Locale . java.util.Locale ) ; this . org.springframework.data.rest.webmvc.json.StaticMessageSource = new StaticMessageSource ( ) ; this . org.springframework.data.rest.webmvc.json.StaticMessageSource . addMessage ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class . java.lang.String ( ) . java.lang.String ( STRING ) . java.lang.String ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . java.lang.String ( ) ) , java.util.Locale . java.util.Locale , STRING ) ; this . org.springframework.data.rest.webmvc.json.EnumTranslator = new EnumTranslator ( new MessageSourceAccessor ( org.springframework.data.rest.webmvc.json.StaticMessageSource ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new EnumTranslator ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , null ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , null ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.webmvc.json.EnumTranslator . setEnableDefaultTranslation ( false ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . asText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . java.lang.String ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . asText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.webmvc.json.EnumTranslator . setEnableDefaultTranslation ( false ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { LocaleContextHolder . setLocale ( java.util.Locale . java.util.Locale ) ; org.springframework.data.rest.webmvc.json.StaticMessageSource . addMessage ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class . java.lang.String ( ) . java.lang.String ( STRING ) . java.lang.String ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . java.lang.String ( ) ) , java.util.Locale . java.util.Locale , STRING ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . asText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isNull ( ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.webmvc.json.EnumTranslator . setEnableDefaultTranslation ( false ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isNull ( ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.rest.webmvc.json.EnumTranslator . setParseEnumNameAsFallback ( false ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isNull ( ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isEqualTo ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum . org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum ) ; assertThat ( org.springframework.data.rest.webmvc.json.EnumTranslator . fromText ( org.springframework.data.rest.webmvc.json.EnumTranslatorUnitTests.MyEnum .class , STRING ) ) . isNull ( ) ; }  <METHOD_END>
