<METHOD_START> public void void ( int int ) { this . int = int ; }  <METHOD_END>
<METHOD_START> public void void ( java.math.RoundingMode java.math.RoundingMode ) { this . java.math.RoundingMode = java.math.RoundingMode ; }  <METHOD_END>
<METHOD_START> public void void ( java.util.Currency java.util.Currency ) { this . java.util.Currency = java.util.Currency ; }  <METHOD_END>
<METHOD_START> public void void ( java.lang.String java.lang.String ) { this . java.lang.String = java.lang.String ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.math.BigDecimal java.math.BigDecimal ( java.lang.String java.lang.String , java.util.Locale java.util.Locale ) throws java.text.ParseException { java.math.BigDecimal java.math.BigDecimal = ( java.math.BigDecimal ) super. parse ( java.lang.String , java.util.Locale ) ; if ( java.math.BigDecimal != null ) { if ( this . java.math.RoundingMode != null ) { java.math.BigDecimal = java.math.BigDecimal . java.math.BigDecimal ( this . int , this . java.math.RoundingMode ) ; } else { java.math.BigDecimal = java.math.BigDecimal . java.math.BigDecimal ( this . int ) ; } } return java.math.BigDecimal ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.text.NumberFormat java.text.NumberFormat ( java.util.Locale java.util.Locale ) { java.text.DecimalFormat java.text.DecimalFormat = ( java.text.DecimalFormat ) java.text.NumberFormat . java.text.NumberFormat ( java.util.Locale ) ; java.text.DecimalFormat . void ( true ) ; java.text.DecimalFormat . void ( this . int ) ; java.text.DecimalFormat . void ( this . int ) ; if ( this . java.math.RoundingMode != null ) { java.text.DecimalFormat . void ( this . java.math.RoundingMode ) ; } if ( this . java.util.Currency != null ) { java.text.DecimalFormat . void ( this . java.util.Currency ) ; } if ( this . java.lang.String != null ) { java.text.DecimalFormat . void ( this . java.lang.String ) ; } return java.text.DecimalFormat ; }  <METHOD_END>
