<METHOD_START> @ java.lang.Override protected boolean boolean ( ) { return super. enableForkByDefault ( ) || boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( ) { super. logDisabledFork ( ) ; if ( boolean ( ) ) { getLog ( ) . warn ( STRING ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.io.File java.io.File , java.util.List<java.lang.String> < java.lang.String > java.util.List<java.lang.String> )			throws org.springframework.boot.maven.MojoExecutionException { try { RunProcess org.springframework.boot.maven.RunProcess = new RunProcess ( java.io.File , new JavaExecutable ( ) . toString ( ) ) ; java.lang.Runtime . java.lang.Runtime ( ) . void ( new java.lang.Thread ( new org.springframework.boot.maven.RunMojo.RunProcessKiller ( org.springframework.boot.maven.RunProcess ) ) ) ; int int = org.springframework.boot.maven.RunProcess . run ( true , java.util.List<java.lang.String> . java.lang.String[] ( new java.lang.String [ java.util.List<java.lang.String> . int ( ) ] ) ) ; if ( int == NUMBER || int == int ) { return; } throw new MojoExecutionException ( STRING + int ) ; } catch ( java.lang.Exception java.lang.Exception ) { throw new MojoExecutionException ( STRING , java.lang.Exception ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected void void ( java.lang.String java.lang.String , java.lang.String ... java.lang.String[] )			throws org.springframework.boot.maven.MojoExecutionException { IsolatedThreadGroup org.springframework.boot.maven.IsolatedThreadGroup = new IsolatedThreadGroup ( java.lang.String ) ; java.lang.Thread java.lang.Thread = new java.lang.Thread ( org.springframework.boot.maven.IsolatedThreadGroup , new LaunchRunner ( java.lang.String , java.lang.String[] ) , STRING ) ; java.lang.Thread . void ( new java.net.URLClassLoader ( getClassPathUrls ( ) ) ) ; java.lang.Thread . void ( ) ; void ( org.springframework.boot.maven.IsolatedThreadGroup ) ; org.springframework.boot.maven.IsolatedThreadGroup . rethrowUncaughtException ( ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.lang.ThreadGroup java.lang.ThreadGroup ) { boolean boolean ; do { boolean = false ; java.lang.Thread [] java.lang.Thread[] = new java.lang.Thread [ java.lang.ThreadGroup . int ( ) ] ; java.lang.ThreadGroup . int ( java.lang.Thread[] ) ; for ( java.lang.Thread java.lang.Thread : java.lang.Thread[] ) { if ( java.lang.Thread != null && ! java.lang.Thread . boolean ( ) ) { try { boolean = true ; java.lang.Thread . void ( ) ; } catch ( java.lang.InterruptedException java.lang.InterruptedException ) { java.lang.Thread . java.lang.Thread ( ) . void ( ) ; } } } } while ( boolean ); }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { if ( this . java.lang.Boolean == null ) { this . java.lang.Boolean = boolean ( ) ; } return this . java.lang.Boolean ; }  <METHOD_END>
<METHOD_START> @ java.lang.SuppressWarnings ( STRING ) private boolean boolean ( ) { try { java.net.URL [] java.net.URL[] = getClassPathUrls ( ) ; java.net.URLClassLoader java.net.URLClassLoader = new java.net.URLClassLoader ( java.net.URL[] ) ; return ( java.net.URLClassLoader . java.net.URL ( java.lang.String ) != null ) ; } catch ( java.lang.Exception java.lang.Exception ) { return false ; } }  <METHOD_END>
<METHOD_START> private void ( RunProcess org.springframework.boot.maven.RunProcess ) { this . org.springframework.boot.maven.RunProcess = org.springframework.boot.maven.RunProcess ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ) { this . org.springframework.boot.maven.RunProcess . kill ( ) ; }  <METHOD_END>
