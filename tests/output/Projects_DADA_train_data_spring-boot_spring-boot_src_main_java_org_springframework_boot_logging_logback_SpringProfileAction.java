<METHOD_START> void ( Environment org.springframework.boot.logging.logback.Environment ) { this . org.springframework.boot.logging.logback.Environment = org.springframework.boot.logging.logback.Environment ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( InterpretationContext org.springframework.boot.logging.logback.InterpretationContext , java.lang.String java.lang.String , org.xml.sax.Attributes org.xml.sax.Attributes )			throws org.springframework.boot.logging.logback.ActionException { this . int ++ ; if ( this . int != NUMBER ) { return; } org.springframework.boot.logging.logback.InterpretationContext . pushObject ( this ) ; this . boolean = boolean ( org.springframework.boot.logging.logback.InterpretationContext , org.xml.sax.Attributes ) ; this . java.util.List<org.springframework.boot.logging.logback.SaxEvent> = new java.util.ArrayList <> ( ) ; org.springframework.boot.logging.logback.InterpretationContext . addInPlayListener ( this ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( InterpretationContext org.springframework.boot.logging.logback.InterpretationContext , org.xml.sax.Attributes org.xml.sax.Attributes ) { java.lang.String [] java.lang.String[] = StringUtils . trimArrayElements ( StringUtils . commaDelimitedListToStringArray ( org.xml.sax.Attributes . java.lang.String ( NAME_ATTRIBUTE ) ) ) ; if ( java.lang.String[] . int != NUMBER ) { for ( java.lang.String java.lang.String : java.lang.String[] ) { OptionHelper . substVars ( java.lang.String , org.springframework.boot.logging.logback.InterpretationContext , this . context ) ; } return this . org.springframework.boot.logging.logback.Environment != null && this . org.springframework.boot.logging.logback.Environment . acceptsProfiles ( java.lang.String[] ) ; } return false ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( InterpretationContext org.springframework.boot.logging.logback.InterpretationContext , java.lang.String java.lang.String ) throws org.springframework.boot.logging.logback.ActionException { this . int -- ; if ( this . int != NUMBER ) { return; } org.springframework.boot.logging.logback.InterpretationContext . removeInPlayListener ( this ) ; void ( org.springframework.boot.logging.logback.InterpretationContext ) ; if ( this . boolean ) { void ( org.springframework.boot.logging.logback.InterpretationContext ) ; } }  <METHOD_END>
<METHOD_START> private void void ( InterpretationContext org.springframework.boot.logging.logback.InterpretationContext ) { java.lang.Object java.lang.Object = org.springframework.boot.logging.logback.InterpretationContext . peekObject ( ) ; Assert . state ( java.lang.Object != null , STRING ) ; Assert . isInstanceOf ( org.springframework.boot.logging.logback.SpringProfileAction .class , java.lang.Object , STRING ) ; Assert . state ( java.lang.Object == this , STRING ) ; org.springframework.boot.logging.logback.InterpretationContext . popObject ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( InterpretationContext org.springframework.boot.logging.logback.InterpretationContext ) { Interpreter org.springframework.boot.logging.logback.Interpreter = org.springframework.boot.logging.logback.InterpretationContext . getJoranInterpreter ( ) ; this . java.util.List<org.springframework.boot.logging.logback.SaxEvent> . remove ( NUMBER ) ; this . java.util.List<org.springframework.boot.logging.logback.SaxEvent> . remove ( this . java.util.List<org.springframework.boot.logging.logback.SaxEvent> . size ( ) - NUMBER ) ; org.springframework.boot.logging.logback.Interpreter . getEventPlayer ( ) . addEventsDynamically ( this . java.util.List<org.springframework.boot.logging.logback.SaxEvent> , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( SaxEvent org.springframework.boot.logging.logback.SaxEvent ) { this . java.util.List<org.springframework.boot.logging.logback.SaxEvent> . add ( org.springframework.boot.logging.logback.SaxEvent ) ; }  <METHOD_END>
