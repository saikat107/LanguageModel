<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( new OrderBySource ( STRING ) . toSort ( ) ) . isEqualTo ( Sort . by ( STRING ) . descending ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { assertThat ( new OrderBySource ( STRING ) . toSort ( ) ) . isEqualTo ( Sort . by ( STRING ) . descending ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { OrderBySource org.springframework.data.repository.query.parser.OrderBySource = new OrderBySource ( STRING ) ; assertThat ( org.springframework.data.repository.query.parser.OrderBySource . toSort ( ) ) . isEqualTo ( Sort . by ( STRING ) . ascending ( ) . and ( Sort . by ( STRING ) . descending ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) java.lang.Exception { new OrderBySource ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { OrderBySource org.springframework.data.repository.query.parser.OrderBySource = new OrderBySource ( STRING , java.util.Optional . java.util.Optional<java.lang.Class<org.springframework.data.repository.query.parser.OrderBySourceUnitTests.Foo>> ( org.springframework.data.repository.query.parser.OrderBySourceUnitTests.Foo .class ) ) ; assertThat ( org.springframework.data.repository.query.parser.OrderBySource . toSort ( ) ) . isEqualTo ( Sort . by ( STRING ) . descending ( ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { OrderBySource org.springframework.data.repository.query.parser.OrderBySource = new OrderBySource ( STRING ) ; assertThat ( org.springframework.data.repository.query.parser.OrderBySource . toSort ( ) ) . isEqualTo ( Sort . by ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( new OrderBySource ( STRING ) . toSort ( ) ) . isEqualTo ( Sort . unsorted ( ) ) ; }  <METHOD_END>
