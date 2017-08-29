<METHOD_START> @ java.lang.Override public boolean boolean ( ) { try { java.net.URL java.net.URL = getURL ( ) ; if ( java.net.URL . java.lang.String ( ) . boolean ( ResourceUtils . URL_PROTOCOL_VFS ) ) { return org.springframework.core.io.AbstractFileResolvingResource.VfsResourceDelegate . org.springframework.core.io.Resource ( java.net.URL ) . isFile ( ) ; } return ResourceUtils . URL_PROTOCOL_FILE . equals ( java.net.URL . java.lang.String ( ) ) ; } catch ( java.io.IOException java.io.IOException ) { return false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.io.File java.io.File ( ) java.io.IOException { java.net.URL java.net.URL = getURL ( ) ; if ( java.net.URL . java.lang.String ( ) . boolean ( ResourceUtils . URL_PROTOCOL_VFS ) ) { return org.springframework.core.io.AbstractFileResolvingResource.VfsResourceDelegate . org.springframework.core.io.Resource ( java.net.URL ) . getFile ( ) ; } return ResourceUtils . getFile ( java.net.URL , getDescription ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override protected java.io.File java.io.File ( ) java.io.IOException { java.net.URL java.net.URL = getURL ( ) ; if ( ResourceUtils . isJarURL ( java.net.URL ) ) { java.net.URL java.net.URL = ResourceUtils . extractArchiveURL ( java.net.URL ) ; if ( java.net.URL . java.lang.String ( ) . boolean ( ResourceUtils . URL_PROTOCOL_VFS ) ) { return org.springframework.core.io.AbstractFileResolvingResource.VfsResourceDelegate . org.springframework.core.io.Resource ( java.net.URL ) . getFile ( ) ; } return ResourceUtils . getFile ( java.net.URL , STRING ) ; } else { return java.io.File ( ) ; } }  <METHOD_END>
<METHOD_START> protected boolean boolean ( java.net.URI java.net.URI ) { try { if ( java.net.URI . java.lang.String ( ) . boolean ( ResourceUtils . URL_PROTOCOL_VFS ) ) { return org.springframework.core.io.AbstractFileResolvingResource.VfsResourceDelegate . org.springframework.core.io.Resource ( java.net.URI ) . isFile ( ) ; } return ResourceUtils . URL_PROTOCOL_FILE . equals ( java.net.URI . java.lang.String ( ) ) ; } catch ( java.io.IOException java.io.IOException ) { return false ; } }  <METHOD_END>
<METHOD_START> protected java.io.File java.io.File ( java.net.URI java.net.URI ) throws java.io.IOException { if ( java.net.URI . java.lang.String ( ) . boolean ( ResourceUtils . URL_PROTOCOL_VFS ) ) { return org.springframework.core.io.AbstractFileResolvingResource.VfsResourceDelegate . org.springframework.core.io.Resource ( java.net.URI ) . getFile ( ) ; } return ResourceUtils . getFile ( java.net.URI , getDescription ( ) ) ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.nio.channels.ReadableByteChannel java.nio.channels.ReadableByteChannel ( ) java.io.IOException { if ( boolean ( ) ) { return new java.io.FileInputStream ( java.io.File ( ) ) . java.nio.channels.FileChannel ( ) ; } else { return super. readableChannel ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { try { java.net.URL java.net.URL = getURL ( ) ; if ( ResourceUtils . isFileURL ( java.net.URL ) ) { return java.io.File ( ) . boolean ( ) ; } else { java.net.URLConnection java.net.URLConnection = java.net.URL . java.net.URLConnection ( ) ; void ( java.net.URLConnection ) ; java.net.HttpURLConnection java.net.HttpURLConnection = ( java.net.URLConnection instanceof java.net.HttpURLConnection ? ( java.net.HttpURLConnection ) java.net.URLConnection : null ) ; if ( java.net.HttpURLConnection != null ) { int int = java.net.HttpURLConnection . int ( ) ; if ( int == java.net.HttpURLConnection . int ) { return true ; } else if ( int == java.net.HttpURLConnection . int ) { return false ; } } if ( java.net.URLConnection . int ( ) >= NUMBER ) { return true ; } if ( java.net.HttpURLConnection != null ) { java.net.HttpURLConnection . void ( ) ; return false ; } else { java.io.InputStream java.io.InputStream = getInputStream ( ) ; java.io.InputStream . void ( ) ; return true ; } } } catch ( java.io.IOException java.io.IOException ) { return false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { try { java.net.URL java.net.URL = getURL ( ) ; if ( ResourceUtils . isFileURL ( java.net.URL ) ) { java.io.File java.io.File = java.io.File ( ) ; return ( java.io.File . boolean ( ) && ! java.io.File . boolean ( ) ) ; } else { return true ; } } catch ( java.io.IOException java.io.IOException ) { return false ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) java.io.IOException { java.net.URL java.net.URL = getURL ( ) ; if ( ResourceUtils . isFileURL ( java.net.URL ) ) { return java.io.File ( ) . long ( ) ; } else { java.net.URLConnection java.net.URLConnection = java.net.URL . java.net.URLConnection ( ) ; void ( java.net.URLConnection ) ; return java.net.URLConnection . int ( ) ; } }  <METHOD_END>
<METHOD_START> @ java.lang.Override public long long ( ) java.io.IOException { java.net.URL java.net.URL = getURL ( ) ; if ( ResourceUtils . isFileURL ( java.net.URL ) || ResourceUtils . isJarURL ( java.net.URL ) ) { return super. lastModified ( ) ; } else { java.net.URLConnection java.net.URLConnection = java.net.URL . java.net.URLConnection ( ) ; void ( java.net.URLConnection ) ; return java.net.URLConnection . long ( ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( java.net.URLConnection java.net.URLConnection ) throws java.io.IOException { ResourceUtils . useCachesIfNecessary ( java.net.URLConnection ) ; if ( java.net.URLConnection instanceof java.net.HttpURLConnection ) { void ( ( java.net.HttpURLConnection ) java.net.URLConnection ) ; } }  <METHOD_END>
<METHOD_START> protected void void ( java.net.HttpURLConnection java.net.HttpURLConnection ) throws java.io.IOException { java.net.HttpURLConnection . void ( STRING ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.core.io.Resource org.springframework.core.io.Resource ( java.net.URL java.net.URL ) throws java.io.IOException { return new VfsResource ( VfsUtils . getRoot ( java.net.URL ) ) ; }  <METHOD_END>
<METHOD_START> public static org.springframework.core.io.Resource org.springframework.core.io.Resource ( java.net.URI java.net.URI ) throws java.io.IOException { return new VfsResource ( VfsUtils . getRoot ( java.net.URI ) ) ; }  <METHOD_END>
