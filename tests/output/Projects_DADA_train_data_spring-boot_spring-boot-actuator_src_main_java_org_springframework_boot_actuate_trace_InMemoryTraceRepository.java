<METHOD_START> public void void ( boolean boolean ) { synchronized ( this . java.util.List<org.springframework.boot.actuate.trace.Trace> ) { this . boolean = boolean ; } }  <METHOD_END>
<METHOD_START> public void void ( int int ) { synchronized ( this . java.util.List<org.springframework.boot.actuate.trace.Trace> ) { this . int = int ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.List<org.springframework.boot.actuate.trace.Trace> < Trace > java.util.List<org.springframework.boot.actuate.trace.Trace> ( ) { synchronized ( this . java.util.List<org.springframework.boot.actuate.trace.Trace> ) { return java.util.Collections . java.util.List<org.springframework.boot.actuate.trace.Trace> ( new java.util.ArrayList <> ( this . java.util.List<org.springframework.boot.actuate.trace.Trace> ) ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> ) { Trace org.springframework.boot.actuate.trace.Trace = new Trace ( new java.util.Date ( ) , java.util.Map<java.lang.String,java.lang.Object> ) ; synchronized ( this . java.util.List<org.springframework.boot.actuate.trace.Trace> ) { while ( this . java.util.List<org.springframework.boot.actuate.trace.Trace> . size ( ) >= this . int ) { this . java.util.List<org.springframework.boot.actuate.trace.Trace> . remove ( this . boolean ? this . int - NUMBER : NUMBER ) ; } if ( this . boolean ) { this . java.util.List<org.springframework.boot.actuate.trace.Trace> . add ( NUMBER , org.springframework.boot.actuate.trace.Trace ) ; } else { this . java.util.List<org.springframework.boot.actuate.trace.Trace> . add ( org.springframework.boot.actuate.trace.Trace ) ; } } }  <METHOD_END>
