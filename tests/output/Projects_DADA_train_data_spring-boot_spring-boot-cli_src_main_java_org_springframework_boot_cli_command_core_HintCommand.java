<METHOD_START> public void ( CommandRunner org.springframework.boot.cli.command.core.CommandRunner ) { super( STRING , STRING ); this . org.springframework.boot.cli.command.core.CommandRunner = org.springframework.boot.cli.command.core.CommandRunner ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.cli.command.core.ExitStatus org.springframework.boot.cli.command.core.ExitStatus ( java.lang.String ... java.lang.String[] ) throws java.lang.Exception { try { int int = ( java.lang.String[] . int == NUMBER ? NUMBER : java.lang.Integer . java.lang.Integer ( java.lang.String[] [ NUMBER ] ) - NUMBER ) ; java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( java.lang.String[] . int ) ; for ( int int = NUMBER ; int < java.lang.String[] . int ; int ++ ) { java.util.List<java.lang.String> . boolean ( java.lang.String[] [ int ] ) ; } java.lang.String java.lang.String = STRING ; if ( int < java.util.List<java.lang.String> . int ( ) ) { java.lang.String = java.util.List<java.lang.String> . java.lang.String ( int ) ; } if ( int == NUMBER ) { void ( java.lang.String ) ; } else if ( ! java.util.List<java.lang.String> . boolean ( ) && ( java.lang.String . int ( ) > NUMBER ) ) { java.lang.String java.lang.String = java.util.List<java.lang.String> . java.lang.String ( NUMBER ) ; void ( java.lang.String , java.util.Collections . java.util.List<java.lang.String> ( java.util.List<java.lang.String> ) , java.lang.String ) ; } } catch ( java.lang.Exception java.lang.Exception ) { return ExitStatus . ERROR ; } return ExitStatus . OK ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String ) { for ( Command org.springframework.boot.cli.command.core.Command : this . org.springframework.boot.cli.command.core.CommandRunner ) { if ( boolean ( org.springframework.boot.cli.command.core.Command , java.lang.String ) ) { Log . info ( org.springframework.boot.cli.command.core.Command . getName ( ) + STRING + org.springframework.boot.cli.command.core.Command . getDescription ( ) ) ; } } }  <METHOD_END>
<METHOD_START> private boolean boolean ( Command org.springframework.boot.cli.command.core.Command , java.lang.String java.lang.String ) { if ( org.springframework.boot.cli.command.core.Command instanceof org.springframework.boot.cli.command.core.HintCommand ) { return false ; } return org.springframework.boot.cli.command.core.Command . getName ( ) . startsWith ( java.lang.String ) || ( this . org.springframework.boot.cli.command.core.CommandRunner . isOptionCommand ( org.springframework.boot.cli.command.core.Command ) && ( STRING + org.springframework.boot.cli.command.core.Command . getName ( ) ) . startsWith ( java.lang.String ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.String java.lang.String , java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> , java.lang.String java.lang.String ) { Command org.springframework.boot.cli.command.core.Command = this . org.springframework.boot.cli.command.core.CommandRunner . findCommand ( java.lang.String ) ; if ( org.springframework.boot.cli.command.core.Command != null ) { for ( OptionHelp org.springframework.boot.cli.command.core.OptionHelp : org.springframework.boot.cli.command.core.Command . getOptionsHelp ( ) ) { if ( ! boolean ( org.springframework.boot.cli.command.core.OptionHelp , java.util.List<java.lang.String> ) ) { for ( java.lang.String java.lang.String : org.springframework.boot.cli.command.core.OptionHelp . getOptions ( ) ) { if ( java.lang.String . boolean ( java.lang.String ) ) { Log . info ( java.lang.String + STRING + org.springframework.boot.cli.command.core.OptionHelp . getUsageHelp ( ) ) ; } } } } } }  <METHOD_END>
<METHOD_START> private boolean boolean ( OptionHelp org.springframework.boot.cli.command.core.OptionHelp , java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> ) { for ( java.lang.String java.lang.String : java.util.List<java.lang.String> ) { if ( org.springframework.boot.cli.command.core.OptionHelp . getOptions ( ) . contains ( java.lang.String ) ) { return true ; } } return false ; }  <METHOD_END>
