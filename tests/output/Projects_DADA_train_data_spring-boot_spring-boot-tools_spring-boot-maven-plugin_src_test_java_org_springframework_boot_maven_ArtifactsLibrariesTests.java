<METHOD_START> @ Before public void void ( ) { MockitoAnnotations . initMocks ( this ) ; this . java.util.Set<org.springframework.boot.maven.Artifact> = java.util.Collections . java.util.Set ( this . org.springframework.boot.maven.Artifact ) ; this . org.springframework.boot.maven.ArtifactsLibraries = new ArtifactsLibraries ( this . java.util.Set<org.springframework.boot.maven.Artifact> , null , mock ( Log .class ) ) ; given ( this . org.springframework.boot.maven.Artifact . getFile ( ) ) . willReturn ( this . java.io.File ) ; given ( this . org.springframework.boot.maven.ArtifactHandler . getExtension ( ) ) . willReturn ( STRING ) ; given ( this . org.springframework.boot.maven.Artifact . getArtifactHandler ( ) ) . willReturn ( this . org.springframework.boot.maven.ArtifactHandler ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . org.springframework.boot.maven.Artifact . getType ( ) ) . willReturn ( STRING ) ; given ( this . org.springframework.boot.maven.Artifact . getScope ( ) ) . willReturn ( STRING ) ; this . org.springframework.boot.maven.ArtifactsLibraries . doWithLibraries ( this . org.springframework.boot.maven.LibraryCallback ) ; verify ( this . org.springframework.boot.maven.LibraryCallback ) . library ( this . org.springframework.boot.maven.ArgumentCaptor<org.springframework.boot.maven.Library> . capture ( ) ) ; Library org.springframework.boot.maven.Library = this . org.springframework.boot.maven.ArgumentCaptor<org.springframework.boot.maven.Library> . getValue ( ) ; assertThat ( org.springframework.boot.maven.Library . getFile ( ) ) . isEqualTo ( this . java.io.File ) ; assertThat ( org.springframework.boot.maven.Library . getScope ( ) ) . isEqualTo ( LibraryScope . COMPILE ) ; assertThat ( org.springframework.boot.maven.Library . isUnpackRequired ( ) ) . isFalse ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { given ( this . org.springframework.boot.maven.Artifact . getGroupId ( ) ) . willReturn ( STRING ) ; given ( this . org.springframework.boot.maven.Artifact . getArtifactId ( ) ) . willReturn ( STRING ) ; given ( this . org.springframework.boot.maven.Artifact . getType ( ) ) . willReturn ( STRING ) ; given ( this . org.springframework.boot.maven.Artifact . getScope ( ) ) . willReturn ( STRING ) ; Dependency org.springframework.boot.maven.Dependency = new Dependency ( ) ; org.springframework.boot.maven.Dependency . setGroupId ( STRING ) ; org.springframework.boot.maven.Dependency . setArtifactId ( STRING ) ; this . org.springframework.boot.maven.ArtifactsLibraries = new ArtifactsLibraries ( this . java.util.Set<org.springframework.boot.maven.Artifact> , java.util.Collections . java.util.Set ( org.springframework.boot.maven.Dependency ) , mock ( Log .class ) ) ; this . org.springframework.boot.maven.ArtifactsLibraries . doWithLibraries ( this . org.springframework.boot.maven.LibraryCallback ) ; verify ( this . org.springframework.boot.maven.LibraryCallback ) . library ( this . org.springframework.boot.maven.ArgumentCaptor<org.springframework.boot.maven.Library> . capture ( ) ) ; assertThat ( this . org.springframework.boot.maven.ArgumentCaptor<org.springframework.boot.maven.Library> . getValue ( ) . isUnpackRequired ( ) ) . isTrue ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Artifact org.springframework.boot.maven.Artifact = mock ( Artifact .class ) ; Artifact org.springframework.boot.maven.Artifact = mock ( Artifact .class ) ; given ( org.springframework.boot.maven.Artifact . getType ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getScope ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getGroupId ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getArtifactId ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getBaseVersion ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getFile ( ) ) . willReturn ( new java.io.File ( STRING ) ) ; given ( org.springframework.boot.maven.Artifact . getArtifactHandler ( ) ) . willReturn ( this . org.springframework.boot.maven.ArtifactHandler ) ; given ( org.springframework.boot.maven.Artifact . getType ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getScope ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getGroupId ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getArtifactId ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getBaseVersion ( ) ) . willReturn ( STRING ) ; given ( org.springframework.boot.maven.Artifact . getFile ( ) ) . willReturn ( new java.io.File ( STRING ) ) ; given ( org.springframework.boot.maven.Artifact . getArtifactHandler ( ) ) . willReturn ( this . org.springframework.boot.maven.ArtifactHandler ) ; this . java.util.Set<org.springframework.boot.maven.Artifact> = new java.util.LinkedHashSet <> ( java.util.Arrays . java.util.List ( org.springframework.boot.maven.Artifact , org.springframework.boot.maven.Artifact ) ) ; this . org.springframework.boot.maven.ArtifactsLibraries = new ArtifactsLibraries ( this . java.util.Set<org.springframework.boot.maven.Artifact> , null , mock ( Log .class ) ) ; this . org.springframework.boot.maven.ArtifactsLibraries . doWithLibraries ( this . org.springframework.boot.maven.LibraryCallback ) ; verify ( this . org.springframework.boot.maven.LibraryCallback , times ( NUMBER ) ) . library ( this . org.springframework.boot.maven.ArgumentCaptor<org.springframework.boot.maven.Library> . capture ( ) ) ; assertThat ( this . org.springframework.boot.maven.ArgumentCaptor<org.springframework.boot.maven.Library> . getAllValues ( ) . get ( NUMBER ) . getName ( ) ) . isEqualTo ( STRING ) ; assertThat ( this . org.springframework.boot.maven.ArgumentCaptor<org.springframework.boot.maven.Library> . getAllValues ( ) . get ( NUMBER ) . getName ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>