<METHOD_START> @ java.lang.Override public org.springframework.boot.test.rule.Statement org.springframework.boot.test.rule.Statement ( final Statement org.springframework.boot.test.rule.Statement , Description org.springframework.boot.test.rule.Description ) { return new Statement ( ) { @ java.lang.Override public void void ( ) java.lang.Throwable { void ( ) ; try { org.springframework.boot.test.rule.Statement . evaluate ( ) ; } finally { try { if ( ! org.springframework.boot.test.rule.OutputCapture .this . java.util.List<org.springframework.boot.test.rule.Matcher<? super java.lang.String>> . isEmpty ( ) ) { java.lang.String java.lang.String = org.springframework.boot.test.rule.OutputCapture .this . java.lang.String ( ) ; Assert . assertThat ( java.lang.String , allOf ( org.springframework.boot.test.rule.OutputCapture .this . java.util.List<org.springframework.boot.test.rule.Matcher<? super java.lang.String>> ) ) ; } } finally { void ( ) ; } } } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.lang.Throwable { void ( ) ; try { org.springframework.boot.test.rule.Statement . evaluate ( ) ; } finally { try { if ( ! org.springframework.boot.test.rule.OutputCapture .this . java.util.List<org.springframework.boot.test.rule.Matcher<? super java.lang.String>> . isEmpty ( ) ) { java.lang.String java.lang.String = org.springframework.boot.test.rule.OutputCapture .this . java.lang.String ( ) ; Assert . assertThat ( java.lang.String , allOf ( org.springframework.boot.test.rule.OutputCapture .this . java.util.List<org.springframework.boot.test.rule.Matcher<? super java.lang.String>> ) ) ; } } finally { void ( ) ; } } }  <METHOD_END>
<METHOD_START> protected void void ( ) { org.springframework.boot.test.rule.OutputCapture.AnsiOutputControl . org.springframework.boot.test.rule.OutputCapture.AnsiOutputControl ( ) . void ( ) ; this . java.io.ByteArrayOutputStream = new java.io.ByteArrayOutputStream ( ) ; this . org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream = new org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream ( java.lang.System . java.io.PrintStream , this . java.io.ByteArrayOutputStream ) ; this . org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream = new org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream ( java.lang.System . java.io.PrintStream , this . java.io.ByteArrayOutputStream ) ; java.lang.System . void ( new java.io.PrintStream ( this . org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream ) ) ; java.lang.System . void ( new java.io.PrintStream ( this . org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( ) { org.springframework.boot.test.rule.OutputCapture.AnsiOutputControl . org.springframework.boot.test.rule.OutputCapture.AnsiOutputControl ( ) . void ( ) ; java.lang.System . void ( this . org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream . java.io.PrintStream ( ) ) ; java.lang.System . void ( this . org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream . java.io.PrintStream ( ) ) ; this . java.io.ByteArrayOutputStream = null ; }  <METHOD_END>
<METHOD_START> public void void ( ) { this . java.io.ByteArrayOutputStream . void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) { try { this . org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream . void ( ) ; this . org.springframework.boot.test.rule.OutputCapture.CaptureOutputStream . void ( ) ; } catch ( java.io.IOException java.io.IOException ) { } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { void ( ) ; return this . java.io.ByteArrayOutputStream . java.lang.String ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( Matcher < ? super java.lang.String > org.springframework.boot.test.rule.Matcher<? super java.lang.String> ) { this . java.util.List<org.springframework.boot.test.rule.Matcher<? super java.lang.String>> . add ( org.springframework.boot.test.rule.Matcher<> ) ; }  <METHOD_END>
<METHOD_START> void ( java.io.PrintStream java.io.PrintStream , java.io.OutputStream java.io.OutputStream ) { this . java.io.PrintStream = java.io.PrintStream ; this . java.io.OutputStream = java.io.OutputStream ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( int int ) throws java.io.IOException { this . java.io.OutputStream . void ( int ) ; this . java.io.PrintStream . void ( int ) ; this . java.io.PrintStream . void ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( byte [] byte[] ) throws java.io.IOException { void ( byte[] , NUMBER , byte[] . int ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( byte [] byte[] , int int , int int ) throws java.io.IOException { this . java.io.OutputStream . void ( byte[] , int , int ) ; this . java.io.PrintStream . void ( byte[] , int , int ) ; }  <METHOD_END>
<METHOD_START> public java.io.PrintStream java.io.PrintStream ( ) { return this . java.io.PrintStream ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) java.io.IOException { this . java.io.OutputStream . void ( ) ; this . java.io.PrintStream . void ( ) ; }  <METHOD_END>
<METHOD_START> public void void ( ) {		}  <METHOD_END>
<METHOD_START> public void void ( ) {		}  <METHOD_END>
<METHOD_START> public static org.springframework.boot.test.rule.OutputCapture.AnsiOutputControl org.springframework.boot.test.rule.OutputCapture.AnsiOutputControl ( ) { try { java.lang.Class . java.lang.Class<?> ( STRING ) ; return new org.springframework.boot.test.rule.OutputCapture.AnsiPresentOutputControl ( ) ; } catch ( java.lang.ClassNotFoundException java.lang.ClassNotFoundException ) { return new org.springframework.boot.test.rule.OutputCapture.AnsiOutputControl ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { AnsiOutput . setEnabled ( Enabled . NEVER ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { AnsiOutput . setEnabled ( Enabled . DETECT ) ; }  <METHOD_END>
