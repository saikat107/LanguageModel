<METHOD_START> @ Test public void void ( ) { assertEquals ( TagUtils . SCOPE_PAGE , STRING ) ; assertEquals ( TagUtils . SCOPE_APPLICATION , STRING ) ; assertEquals ( TagUtils . SCOPE_SESSION , STRING ) ; assertEquals ( TagUtils . SCOPE_REQUEST , STRING ) ; assertEquals ( PageContext . PAGE_SCOPE , TagUtils . getScope ( STRING ) ) ; assertEquals ( PageContext . REQUEST_SCOPE , TagUtils . getScope ( STRING ) ) ; assertEquals ( PageContext . SESSION_SCOPE , TagUtils . getScope ( STRING ) ) ; assertEquals ( PageContext . APPLICATION_SCOPE , TagUtils . getScope ( STRING ) ) ; assertEquals ( STRING + STRING , PageContext . PAGE_SCOPE , TagUtils . getScope ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { TagUtils . getScope ( null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { assertFalse ( TagUtils . hasAncestorOfType ( new TagSupport ( ) , java.lang.String .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { assertFalse ( TagUtils . hasAncestorOfType ( null , TagSupport .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { assertFalse ( TagUtils . hasAncestorOfType ( new TagSupport ( ) , null ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagA ( ) ; Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagB ( ) ; Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagC ( ) ; org.springframework.web.util.Tag . setParent ( org.springframework.web.util.Tag ) ; org.springframework.web.util.Tag . setParent ( org.springframework.web.util.Tag ) ; assertTrue ( TagUtils . hasAncestorOfType ( org.springframework.web.util.Tag , org.springframework.web.util.TagUtilsTests.TagC .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagA ( ) ; Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagB ( ) ; Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagB ( ) ; org.springframework.web.util.Tag . setParent ( org.springframework.web.util.Tag ) ; org.springframework.web.util.Tag . setParent ( org.springframework.web.util.Tag ) ; assertFalse ( TagUtils . hasAncestorOfType ( org.springframework.web.util.Tag , org.springframework.web.util.TagUtilsTests.TagC .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertFalse ( TagUtils . hasAncestorOfType ( new org.springframework.web.util.TagUtilsTests.TagA ( ) , org.springframework.web.util.TagUtilsTests.TagC .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { TagUtils . assertHasAncestorOfType ( new org.springframework.web.util.TagUtilsTests.TagA ( ) , org.springframework.web.util.TagUtilsTests.TagC .class , null , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { TagUtils . assertHasAncestorOfType ( new org.springframework.web.util.TagUtilsTests.TagA ( ) , org.springframework.web.util.TagUtilsTests.TagC .class , STRING , null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalStateException .class ) public void void ( ) java.lang.Exception { Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagA ( ) ; Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagB ( ) ; Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagB ( ) ; org.springframework.web.util.Tag . setParent ( org.springframework.web.util.Tag ) ; org.springframework.web.util.Tag . setParent ( org.springframework.web.util.Tag ) ; TagUtils . assertHasAncestorOfType ( org.springframework.web.util.Tag , org.springframework.web.util.TagUtilsTests.TagC .class , STRING , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagA ( ) ; Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagB ( ) ; Tag org.springframework.web.util.Tag = new org.springframework.web.util.TagUtilsTests.TagC ( ) ; org.springframework.web.util.Tag . setParent ( org.springframework.web.util.Tag ) ; org.springframework.web.util.Tag . setParent ( org.springframework.web.util.Tag ) ; TagUtils . assertHasAncestorOfType ( org.springframework.web.util.Tag , org.springframework.web.util.TagUtilsTests.TagC .class , STRING , STRING ) ; }  <METHOD_END>