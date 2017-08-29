<METHOD_START> @ Test public void void ( ) java.lang.Exception { this . org.springframework.boot.devtools.classpath.ExpectedException . expect ( java.lang.IllegalArgumentException .class ) ; this . org.springframework.boot.devtools.classpath.ExpectedException . expectMessage ( STRING ) ; java.net.URL [] java.net.URL[] = null ; new ClassPathFileSystemWatcher ( mock ( FileSystemWatcherFactory .class ) , mock ( ClassPathRestartStrategy .class ) , java.net.URL[] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { AnnotationConfigApplicationContext org.springframework.boot.devtools.classpath.AnnotationConfigApplicationContext = new AnnotationConfigApplicationContext ( ) ; java.util.Map<java.lang.String,java.lang.Object> < java.lang.String , java.lang.Object > java.util.Map<java.lang.String,java.lang.Object> = new java.util.HashMap<java.lang.String,java.lang.Object> <> ( ) ; java.io.File java.io.File = this . org.springframework.boot.devtools.classpath.TemporaryFolder . newFolder ( ) ; java.util.List<java.net.URL> < java.net.URL > java.util.List<java.net.URL> = new java.util.ArrayList<java.net.URL> <> ( ) ; java.util.List<java.net.URL> . boolean ( new java.net.URL ( STRING ) ) ; java.util.List<java.net.URL> . boolean ( java.io.File . java.net.URI ( ) . java.net.URL ( ) ) ; java.util.Map<java.lang.String,java.lang.Object> . java.lang.Object ( STRING , java.util.List<java.net.URL> ) ; MapPropertySource org.springframework.boot.devtools.classpath.MapPropertySource = new MapPropertySource ( STRING , java.util.Map<java.lang.String,java.lang.Object> ) ; org.springframework.boot.devtools.classpath.AnnotationConfigApplicationContext . getEnvironment ( ) . getPropertySources ( ) . addLast ( org.springframework.boot.devtools.classpath.MapPropertySource ) ; org.springframework.boot.devtools.classpath.AnnotationConfigApplicationContext . register ( org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcherTests.Config .class ) ; org.springframework.boot.devtools.classpath.AnnotationConfigApplicationContext . refresh ( ) ; java.lang.Thread . void ( NUMBER ) ; java.io.File java.io.File = new java.io.File ( java.io.File , STRING ) ; FileCopyUtils . copy ( STRING . byte[] ( ) , java.io.File ) ; java.lang.Thread . void ( NUMBER ) ; java.util.List<org.springframework.boot.devtools.classpath.ClassPathChangedEvent> < ClassPathChangedEvent > java.util.List<org.springframework.boot.devtools.classpath.ClassPathChangedEvent> = org.springframework.boot.devtools.classpath.AnnotationConfigApplicationContext . getBean ( org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcherTests.Listener .class ) . getEvents ( ) ; for ( int int = NUMBER ; int < NUMBER ; int ++ ) { if ( ! java.util.List<org.springframework.boot.devtools.classpath.ClassPathChangedEvent> . isEmpty ( ) ) { break; } java.lang.Thread . void ( NUMBER ) ; } assertThat ( java.util.List<org.springframework.boot.devtools.classpath.ClassPathChangedEvent> . size ( ) ) . isEqualTo ( NUMBER ) ; assertThat ( java.util.List<org.springframework.boot.devtools.classpath.ClassPathChangedEvent> . get ( NUMBER ) . getChangeSet ( ) . iterator ( ) . next ( ) . getFiles ( ) . iterator ( ) . next ( ) . getFile ( ) ) . isEqualTo ( java.io.File ) ; org.springframework.boot.devtools.classpath.AnnotationConfigApplicationContext . close ( ) ; }  <METHOD_END>
<METHOD_START> public void ( Environment org.springframework.boot.devtools.classpath.Environment ) { this . org.springframework.boot.devtools.classpath.Environment = org.springframework.boot.devtools.classpath.Environment ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcher org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcher ( ) { FileSystemWatcher org.springframework.boot.devtools.classpath.FileSystemWatcher = new FileSystemWatcher ( false , NUMBER , NUMBER ) ; java.net.URL [] java.net.URL[] = this . org.springframework.boot.devtools.classpath.Environment . getProperty ( STRING , java.net.URL [] .class ) ; return new ClassPathFileSystemWatcher ( new org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcherTests.MockFileSystemWatcherFactory ( org.springframework.boot.devtools.classpath.FileSystemWatcher ) , org.springframework.boot.devtools.classpath.ClassPathRestartStrategy ( ) , java.net.URL[] ) ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.devtools.classpath.ClassPathRestartStrategy org.springframework.boot.devtools.classpath.ClassPathRestartStrategy ( ) { return new ClassPathRestartStrategy ( ) { @ java.lang.Override public boolean boolean ( ChangedFile org.springframework.boot.devtools.classpath.ChangedFile ) { return false ; } } ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ChangedFile org.springframework.boot.devtools.classpath.ChangedFile ) { return false ; }  <METHOD_END>
<METHOD_START> @ Bean public org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcherTests.Listener org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcherTests.Listener ( ) { return new org.springframework.boot.devtools.classpath.ClassPathFileSystemWatcherTests.Listener ( ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public void void ( ClassPathChangedEvent org.springframework.boot.devtools.classpath.ClassPathChangedEvent ) { this . java.util.List<org.springframework.boot.devtools.classpath.ClassPathChangedEvent> . add ( org.springframework.boot.devtools.classpath.ClassPathChangedEvent ) ; }  <METHOD_END>
<METHOD_START> public java.util.List<org.springframework.boot.devtools.classpath.ClassPathChangedEvent> < ClassPathChangedEvent > java.util.List<org.springframework.boot.devtools.classpath.ClassPathChangedEvent> ( ) { return this . java.util.List<org.springframework.boot.devtools.classpath.ClassPathChangedEvent> ; }  <METHOD_END>
<METHOD_START> void ( FileSystemWatcher org.springframework.boot.devtools.classpath.FileSystemWatcher ) { this . org.springframework.boot.devtools.classpath.FileSystemWatcher = org.springframework.boot.devtools.classpath.FileSystemWatcher ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public org.springframework.boot.devtools.classpath.FileSystemWatcher org.springframework.boot.devtools.classpath.FileSystemWatcher ( ) { return this . org.springframework.boot.devtools.classpath.FileSystemWatcher ; }  <METHOD_END>