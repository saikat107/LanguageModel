<METHOD_START> @ Test public void void ( ) { assertThat ( QuerydslUtils . toDotPath ( QUser . user . addresses . any ( ) . street ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( toDotPath ( QUser . user . as ( QSpecialUser .class ) . as ( QSpecialUser .class ) . specialProperty ) ) . isEqualTo ( STRING ) ; assertThat ( toDotPath ( QUser . user . as ( QSpecialUser .class ) . specialProperty ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
