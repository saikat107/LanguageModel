<METHOD_START> protected void ( java.lang.String java.lang.String , java.lang.String java.lang.String , OptionHandler org.springframework.boot.cli.command.OptionHandler ) { super( java.lang.String , java.lang.String ); this . org.springframework.boot.cli.command.OptionHandler = org.springframework.boot.cli.command.OptionHandler ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return this . org.springframework.boot.cli.command.OptionHandler . getHelp ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.boot.cli.command.OptionHelp> < OptionHelp > java.util.Collection<org.springframework.boot.cli.command.OptionHelp> ( ) { return this . org.springframework.boot.cli.command.OptionHandler . getOptionsHelp ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public final org.springframework.boot.cli.command.ExitStatus org.springframework.boot.cli.command.ExitStatus ( java.lang.String ... java.lang.String[] ) throws java.lang.Exception { return this . org.springframework.boot.cli.command.OptionHandler . run ( java.lang.String[] ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.cli.command.OptionHandler org.springframework.boot.cli.command.OptionHandler ( ) { return this . org.springframework.boot.cli.command.OptionHandler ; }  <METHOD_END>
