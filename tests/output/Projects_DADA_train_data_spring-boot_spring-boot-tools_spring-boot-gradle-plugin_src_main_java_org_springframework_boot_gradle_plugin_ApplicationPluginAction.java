<METHOD_START> @ java.lang.Override public void void ( Project org.springframework.boot.gradle.plugin.Project ) { ApplicationPluginConvention org.springframework.boot.gradle.plugin.ApplicationPluginConvention = org.springframework.boot.gradle.plugin.Project . getConvention ( ) . getPlugin ( ApplicationPluginConvention .class ) ; DistributionContainer org.springframework.boot.gradle.plugin.DistributionContainer = org.springframework.boot.gradle.plugin.Project . getExtensions ( ) . getByType ( DistributionContainer .class ) ; Distribution org.springframework.boot.gradle.plugin.Distribution = org.springframework.boot.gradle.plugin.DistributionContainer . create ( STRING ) ; CreateBootStartScripts org.springframework.boot.gradle.plugin.CreateBootStartScripts = org.springframework.boot.gradle.plugin.Project . getTasks ( ) . create ( STRING , CreateBootStartScripts .class ) ; ( ( TemplateBasedScriptGenerator ) org.springframework.boot.gradle.plugin.CreateBootStartScripts . getUnixStartScriptGenerator ( ) ) . setTemplate ( org.springframework.boot.gradle.plugin.Project . getResources ( ) . getText ( ) . fromString ( java.lang.String ( STRING ) ) ) ; ( ( TemplateBasedScriptGenerator ) org.springframework.boot.gradle.plugin.CreateBootStartScripts . getWindowsStartScriptGenerator ( ) ) . setTemplate ( org.springframework.boot.gradle.plugin.Project . getResources ( ) . getText ( ) . fromString ( java.lang.String ( STRING ) ) ) ; org.springframework.boot.gradle.plugin.Project . getConfigurations ( ) . all ( configuration -> { if ( STRING . equals ( configuration . getName ( ) ) ) { distribution . getContents ( ) . with ( project . copySpec ( ) . into ( STRING ) . from ( ( Callable < FileCollection > ) ( ) configuration . getArtifacts ( ) . getFiles ( ) ) ) ; bootStartScripts . setClasspath ( configuration . getArtifacts ( ) . getFiles ( ) ) ; } } ) ; org.springframework.boot.gradle.plugin.CreateBootStartScripts . getConventionMapping ( ) . map ( STRING , ( ) new File ( project . getBuildDir ( ) , STRING ) ) ; org.springframework.boot.gradle.plugin.CreateBootStartScripts . getConventionMapping ( ) . map ( STRING , ( ) applicationConvention . getApplicationName ( ) ) ; CopySpec org.springframework.boot.gradle.plugin.CopySpec = org.springframework.boot.gradle.plugin.Project . copySpec ( ) . into ( STRING ) . from ( org.springframework.boot.gradle.plugin.CreateBootStartScripts ) ; org.springframework.boot.gradle.plugin.CopySpec . setFileMode ( NUMBER ) ; org.springframework.boot.gradle.plugin.Distribution . getContents ( ) . with ( org.springframework.boot.gradle.plugin.CopySpec ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Class<? extends org.springframework.boot.gradle.plugin.Plugin<org.springframework.boot.gradle.plugin.Project>> < ? extends Plugin < Project > > java.lang.Class<? extends org.springframework.boot.gradle.plugin.Plugin<org.springframework.boot.gradle.plugin.Project>> ( ) { return ApplicationPlugin .class ; }  <METHOD_END>
<METHOD_START> private java.lang.String java.lang.String ( java.lang.String java.lang.String ) { java.io.InputStreamReader java.io.InputStreamReader = new java.io.InputStreamReader ( java.lang.Class<? extends org.springframework.boot.gradle.plugin.ApplicationPluginAction> ( ) . java.io.InputStream ( java.lang.String ) ) ; char [] char[] = new char [ NUMBER ] ; int int = NUMBER ; java.io.StringWriter java.io.StringWriter = new java.io.StringWriter ( ) ; try { while ( ( int = java.io.InputStreamReader . int ( char[] ) ) > NUMBER ) { java.io.StringWriter . void ( char[] , NUMBER , int ) ; } return java.io.StringWriter . java.lang.String ( ) ; } catch ( java.io.IOException java.io.IOException ) { throw new GradleException ( STRING + java.lang.String + STRING , java.io.IOException ) ; } finally { try { java.io.InputStreamReader . void ( ) ; } catch ( java.io.IOException java.io.IOException ) { } } }  <METHOD_END>
