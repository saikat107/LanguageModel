<METHOD_START> @ Test public void void ( ) { assertEquals ( STRING , org.springframework.format.number.CurrencyStyleFormatter . print ( new java.math.BigDecimal ( STRING ) , java.util.Locale . java.util.Locale ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.text.ParseException { assertEquals ( new java.math.BigDecimal ( STRING ) , org.springframework.format.number.CurrencyStyleFormatter . parse ( STRING , java.util.Locale . java.util.Locale ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.text.ParseException .class ) public void void ( ) java.text.ParseException { org.springframework.format.number.CurrencyStyleFormatter . parse ( STRING , java.util.Locale . java.util.Locale ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.text.ParseException { this . org.springframework.format.number.CurrencyStyleFormatter . setRoundingMode ( java.math.RoundingMode . java.math.RoundingMode ) ; assertEquals ( new java.math.BigDecimal ( STRING ) , org.springframework.format.number.CurrencyStyleFormatter . parse ( STRING , java.util.Locale . java.util.Locale ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.text.ParseException { assertEquals ( new java.math.BigDecimal ( STRING ) , org.springframework.format.number.CurrencyStyleFormatter . parse ( STRING , java.util.Locale . java.util.Locale ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.text.ParseException .class ) public void void ( ) java.text.ParseException { org.springframework.format.number.CurrencyStyleFormatter . parse ( STRING , java.util.Locale . java.util.Locale ) ; }  <METHOD_END>
