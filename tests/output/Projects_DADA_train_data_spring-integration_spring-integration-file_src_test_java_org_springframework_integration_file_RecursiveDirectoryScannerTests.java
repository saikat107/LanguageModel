<METHOD_START> @ Before public void void ( ) java.io.IOException { this . java.io.File = this . org.springframework.integration.file.TemporaryFolder . newFolder ( STRING ) ; this . java.io.File = new java.io.File ( this . java.io.File , STRING ) ; this . java.io.File . boolean ( ) ; this . java.io.File = this . org.springframework.integration.file.TemporaryFolder . newFile ( STRING ) ; this . java.io.File = new java.io.File ( this . java.io.File , STRING ) ; this . java.io.File . boolean ( ) ; this . java.io.File = new java.io.File ( this . java.io.File , STRING ) ; this . java.io.File . boolean ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.io.IOException { RecursiveDirectoryScanner org.springframework.integration.file.RecursiveDirectoryScanner = new RecursiveDirectoryScanner ( ) ; org.springframework.integration.file.RecursiveDirectoryScanner . setFilter ( new AcceptOnceFileListFilter <> ( ) ) ; java.util.List<java.io.File> < java.io.File > java.util.List<java.io.File> = org.springframework.integration.file.RecursiveDirectoryScanner . listFiles ( this . org.springframework.integration.file.TemporaryFolder . getRoot ( ) ) ; assertEquals ( NUMBER , java.util.List<java.io.File> . int ( ) ) ; assertThat ( java.util.List<java.io.File> , hasItem ( this . java.io.File ) ) ; assertThat ( java.util.List<java.io.File> , hasItem ( this . java.io.File ) ) ; assertThat ( java.util.List<java.io.File> , hasItem ( this . java.io.File ) ) ; assertThat ( java.util.List<java.io.File> , hasItem ( this . java.io.File ) ) ; assertThat ( java.util.List<java.io.File> , hasItem ( this . java.io.File ) ) ; java.io.File java.io.File = new java.io.File ( this . java.io.File , STRING ) ; java.io.File . boolean ( ) ; java.util.List<java.io.File> = org.springframework.integration.file.RecursiveDirectoryScanner . listFiles ( this . org.springframework.integration.file.TemporaryFolder . getRoot ( ) ) ; assertEquals ( NUMBER , java.util.List<java.io.File> . int ( ) ) ; assertThat ( java.util.List<java.io.File> , hasItem ( java.io.File ) ) ; }  <METHOD_END>
