<METHOD_START> public void ( ) { this( new org.springframework.boot.cli.command.init.InitCommand.InitOptionHandler ( new InitializrService ( ) ) ); }  <METHOD_END>
<METHOD_START> public void ( org.springframework.boot.cli.command.init.InitCommand.InitOptionHandler org.springframework.boot.cli.command.init.InitCommand.InitOptionHandler ) { super( STRING , STRING + STRING , org.springframework.boot.cli.command.init.InitCommand.InitOptionHandler ); }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.util.Collection<org.springframework.boot.cli.command.init.HelpExample> < HelpExample > java.util.Collection<org.springframework.boot.cli.command.init.HelpExample> ( ) { java.util.List<org.springframework.boot.cli.command.init.HelpExample> < HelpExample > java.util.List<org.springframework.boot.cli.command.init.HelpExample> = new java.util.ArrayList<org.springframework.boot.cli.command.init.HelpExample> <> ( ) ; java.util.List<org.springframework.boot.cli.command.init.HelpExample> . add ( new HelpExample ( STRING , STRING ) ) ; java.util.List<org.springframework.boot.cli.command.init.HelpExample> . add ( new HelpExample ( STRING , STRING ) ) ; java.util.List<org.springframework.boot.cli.command.init.HelpExample> . add ( new HelpExample ( STRING , STRING ) ) ; java.util.List<org.springframework.boot.cli.command.init.HelpExample> . add ( new HelpExample ( STRING , STRING ) ) ; return java.util.List<org.springframework.boot.cli.command.init.HelpExample> ; }  <METHOD_END>
<METHOD_START> void ( InitializrService org.springframework.boot.cli.command.init.InitializrService ) { this . org.springframework.boot.cli.command.init.ServiceCapabilitiesReportGenerator = new ServiceCapabilitiesReportGenerator ( org.springframework.boot.cli.command.init.InitializrService ) ; this . org.springframework.boot.cli.command.init.ProjectGenerator = new ProjectGenerator ( org.springframework.boot.cli.command.init.InitializrService ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING ) , STRING ) . withRequiredArg ( ) . defaultsTo ( ProjectGenerationRequest . DEFAULT_SERVICE_URL ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.Void> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING + STRING ) ; void ( ) ; void ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( STRING , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( STRING , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING + STRING + STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( STRING , STRING ) . withRequiredArg ( ) . defaultsTo ( STRING ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( STRING , STRING + STRING ) . withRequiredArg ( ) . defaultsTo ( STRING ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) . withRequiredArg ( ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING + STRING ) . withRequiredArg ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.Void> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) ; this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.Void> = option ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) , STRING ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected org.springframework.boot.cli.command.init.ExitStatus org.springframework.boot.cli.command.init.ExitStatus ( OptionSet org.springframework.boot.cli.command.init.OptionSet ) throws java.lang.Exception { try { if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.Void> ) ) { void ( org.springframework.boot.cli.command.init.OptionSet ) ; } else { void ( org.springframework.boot.cli.command.init.OptionSet ) ; } return ExitStatus . OK ; } catch ( ReportableException org.springframework.boot.cli.command.init.ReportableException ) { Log . error ( org.springframework.boot.cli.command.init.ReportableException . getMessage ( ) ) ; return ExitStatus . ERROR ; } catch ( java.lang.Exception java.lang.Exception ) { Log . error ( java.lang.Exception ) ; return ExitStatus . ERROR ; } }  <METHOD_END>
<METHOD_START> private void void ( OptionSet org.springframework.boot.cli.command.init.OptionSet ) throws java.io.IOException { Log . info ( this . org.springframework.boot.cli.command.init.ServiceCapabilitiesReportGenerator . generate ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ) ; }  <METHOD_END>
<METHOD_START> protected void void ( OptionSet org.springframework.boot.cli.command.init.OptionSet ) throws java.io.IOException { ProjectGenerationRequest org.springframework.boot.cli.command.init.ProjectGenerationRequest = org.springframework.boot.cli.command.init.ProjectGenerationRequest ( org.springframework.boot.cli.command.init.OptionSet ) ; this . org.springframework.boot.cli.command.init.ProjectGenerator . generateProject ( org.springframework.boot.cli.command.init.ProjectGenerationRequest , org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.Void> ) ) ; }  <METHOD_END>
<METHOD_START> protected org.springframework.boot.cli.command.init.ProjectGenerationRequest org.springframework.boot.cli.command.init.ProjectGenerationRequest ( OptionSet org.springframework.boot.cli.command.init.OptionSet ) { java.util.List<?> < ? > java.util.List<?> = new java.util.ArrayList<java.lang.Object> < java.lang.Object > ( org.springframework.boot.cli.command.init.OptionSet . nonOptionArguments ( ) ) ; Assert . isTrue ( java.util.List<> . int ( ) <= NUMBER , STRING ) ; ProjectGenerationRequest org.springframework.boot.cli.command.init.ProjectGenerationRequest = new ProjectGenerationRequest ( ) ; org.springframework.boot.cli.command.init.ProjectGenerationRequest . setServiceUrl ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setBootVersion ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { for ( java.lang.String java.lang.String : org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) . split ( STRING ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . getDependencies ( ) . add ( java.lang.String . java.lang.String ( ) ) ; } } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setJavaVersion ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setPackageName ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } org.springframework.boot.cli.command.init.ProjectGenerationRequest . setBuild ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; org.springframework.boot.cli.command.init.ProjectGenerationRequest . setFormat ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; org.springframework.boot.cli.command.init.ProjectGenerationRequest . setDetectType ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) || org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setType ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setPackaging ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setLanguage ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setGroupId ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setArtifactId ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setName ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setVersion ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } if ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) { org.springframework.boot.cli.command.init.ProjectGenerationRequest . setDescription ( org.springframework.boot.cli.command.init.OptionSet . valueOf ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.String> ) ) ; } org.springframework.boot.cli.command.init.ProjectGenerationRequest . setExtract ( org.springframework.boot.cli.command.init.OptionSet . has ( this . org.springframework.boot.cli.command.init.OptionSpec<java.lang.Void> ) ) ; if ( java.util.List<> . int ( ) == NUMBER ) { java.lang.String java.lang.String = ( java.lang.String ) java.util.List<> . get ( NUMBER ) ; org.springframework.boot.cli.command.init.ProjectGenerationRequest . setOutput ( java.lang.String ) ; } return org.springframework.boot.cli.command.init.ProjectGenerationRequest ; }  <METHOD_END>