<METHOD_START> @ Test public void void ( ) { assertEquals ( STRING , RegionShortcutConverter . toUpperCase ( STRING ) ) ; assertEquals ( STRING , RegionShortcutConverter . toUpperCase ( STRING ) ) ; assertEquals ( STRING , RegionShortcutConverter . toUpperCase ( STRING ) ) ; assertEquals ( STRING , RegionShortcutConverter . toUpperCase ( STRING ) ) ; assertEquals ( STRING , RegionShortcutConverter . toUpperCase ( STRING ) ) ; assertEquals ( STRING , RegionShortcutConverter . toUpperCase ( null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { for ( RegionShortcut org.springframework.data.gemfire.RegionShortcut : RegionShortcut . values ( ) ) { assertEquals ( org.springframework.data.gemfire.RegionShortcut , org.springframework.data.gemfire.RegionShortcutConverter . convert ( org.springframework.data.gemfire.RegionShortcut . name ( ) ) ) ; } assertEquals ( RegionShortcut . PARTITION_PROXY , org.springframework.data.gemfire.RegionShortcutConverter . convert ( STRING ) ) ; assertEquals ( RegionShortcut . REPLICATE_OVERFLOW , org.springframework.data.gemfire.RegionShortcutConverter . convert ( STRING ) ) ; assertEquals ( RegionShortcut . LOCAL_HEAP_LRU , org.springframework.data.gemfire.RegionShortcutConverter . convert ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.gemfire.RegionShortcutConverter . convert ( STRING ) ; }  <METHOD_END>
