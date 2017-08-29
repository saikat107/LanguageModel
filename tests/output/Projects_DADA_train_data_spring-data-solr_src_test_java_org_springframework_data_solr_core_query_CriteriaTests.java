<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new Criteria ( ( java.lang.String ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new Criteria ( ( Field ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new Criteria ( new SimpleField ( StringUtils . EMPTY ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . is ( STRING ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . is ( STRING ) . is ( STRING ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . is ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . is ( ( java.lang.Object ) null ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . isNull ( ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertTrue ( org.springframework.data.solr.core.query.Criteria . isNegating ( ) ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . isNotNull ( ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertFalse ( org.springframework.data.solr.core.query.Criteria . isNegating ( ) ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new Criteria ( STRING ) . contains ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new Criteria ( STRING ) . startsWith ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new Criteria ( STRING ) . endsWith ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . endsWith ( STRING ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . ENDS_WITH , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . endsWith ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . ENDS_WITH , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . ENDS_WITH , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . ENDS_WITH , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . STARTS_WITH , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . STARTS_WITH , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . STARTS_WITH , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . STARTS_WITH , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . contains ( STRING ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . CONTAINS , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . contains ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING , STRING ) ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . CONTAINS , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . CONTAINS , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . CONTAINS , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . expression ( STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EXPRESSION , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) . endsWith ( STRING ) . contains ( STRING ) . is ( STRING ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . STARTS_WITH , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . ENDS_WITH , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . CONTAINS , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) . endsWith ( STRING ) . and ( STRING ) . startsWith ( STRING ) . endsWith ( STRING ) ; Assert . assertThat ( org.springframework.data.solr.core.query.Criteria , IsInstanceOf . instanceOf ( Crotch .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) . endsWith ( STRING ) ; Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) ; Crotch org.springframework.data.solr.core.query.Crotch = org.springframework.data.solr.core.query.Criteria . and ( org.springframework.data.solr.core.query.Criteria ) ; Assert . assertThat ( org.springframework.data.solr.core.query.Crotch . getSiblings ( ) , IsIterableContainingInOrder .< Node > contains ( org.springframework.data.solr.core.query.Criteria , org.springframework.data.solr.core.query.Criteria ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) . or ( STRING ) . endsWith ( STRING ) . startsWith ( STRING ) ; Assert . assertThat ( org.springframework.data.solr.core.query.Criteria , IsInstanceOf . instanceOf ( Crotch .class ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) . endsWith ( STRING ) ; Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) ; Crotch org.springframework.data.solr.core.query.Crotch = org.springframework.data.solr.core.query.Criteria . or ( org.springframework.data.solr.core.query.Criteria ) ; Assert . assertThat ( org.springframework.data.solr.core.query.Crotch . getSiblings ( ) , IsIterableContainingInOrder .< Node > contains ( org.springframework.data.solr.core.query.Criteria , org.springframework.data.solr.core.query.Criteria ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) . endsWith ( STRING ) ; Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . startsWith ( STRING ) ; Crotch org.springframework.data.solr.core.query.Crotch = org.springframework.data.solr.core.query.Criteria . or ( org.springframework.data.solr.core.query.Criteria ) ; Assert . assertThat ( org.springframework.data.solr.core.query.Crotch . getField ( ) . getName ( ) , Is . is ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . is ( STRING ) . not ( ) ; Assert . assertTrue ( org.springframework.data.solr.core.query.Criteria . isNegating ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . fuzzy ( STRING ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( STRING , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( java.lang.Float . float , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . fuzzy ( STRING , NUMBER ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( STRING , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new Criteria ( STRING ) . fuzzy ( STRING , - NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new Criteria ( STRING ) . fuzzy ( STRING , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . sloppy ( STRING , NUMBER ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( STRING , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new Criteria ( STRING ) . sloppy ( STRING , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new Criteria ( STRING ) . sloppy ( STRING , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . is ( STRING ) . boost ( NUMBER ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; Assert . assertEquals ( NUMBER , org.springframework.data.solr.core.query.Criteria . getBoost ( ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . between ( NUMBER , NUMBER ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . between ( NUMBER , null ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . between ( null , NUMBER ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . between ( NUMBER , NUMBER , false , true ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertFalse ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . between ( NUMBER , NUMBER , true , false ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertFalse ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . between ( null , null ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . lessThan ( NUMBER ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertFalse ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . lessThanEqual ( NUMBER ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . lessThanEqual ( null ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . greaterThan ( NUMBER ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertFalse ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . greaterThanEqual ( NUMBER ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertEquals ( NUMBER , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . greaterThanEqual ( null ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . BETWEEN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertNull ( ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertTrue ( ( java.lang.Boolean ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . in ( NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER , NUMBER ) ; Assert . assertEquals ( STRING , org.springframework.data.solr.core.query.Criteria . getField ( ) . getName ( ) ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , NUMBER ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , NUMBER ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , NUMBER ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , NUMBER ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , NUMBER ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , NUMBER ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { java.util.List<java.util.List<java.lang.String>> < java.util.List<java.lang.String> < java.lang.String > > java.util.List<java.util.List<java.lang.String>> = new java.util.ArrayList<java.util.List<java.lang.String>> <> ( ) ; java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Arrays . java.util.List<java.lang.String> ( STRING , STRING ) ) ; java.util.List<java.util.List<java.lang.String>> . boolean ( java.util.Collections . java.util.List<java.lang.String> ( STRING ) ) ; Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . in ( java.util.List<java.util.List<java.lang.String>> ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; void ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER , OperationKey . EQUALS , STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new Criteria ( STRING ) . in ( ( java.util.Collection<?> < ? > ) null ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new Criteria ( STRING ) . in ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Point org.springframework.data.solr.core.query.Point = new Point ( NUMBER , NUMBER ) ; Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . near ( org.springframework.data.solr.core.query.Point , new Distance ( NUMBER ) ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . NEAR . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertEquals ( org.springframework.data.solr.core.query.Point , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( Distance ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) . getValue ( ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new Criteria ( STRING ) . near ( null , new Distance ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = InvalidDataAccessApiUsageException .class ) public void void ( ) { new Criteria ( STRING ) . near ( new Point ( NUMBER , NUMBER ) , new Distance ( - NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { Point org.springframework.data.solr.core.query.Point = new Point ( NUMBER , NUMBER ) ; Criteria org.springframework.data.solr.core.query.Criteria = new Criteria ( STRING ) . within ( org.springframework.data.solr.core.query.Point , new Distance ( NUMBER ) ) ; Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( org.springframework.data.solr.core.query.Criteria . getPredicates ( ) , NUMBER ) ; Assert . assertEquals ( OperationKey . WITHIN . getKey ( ) , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; Assert . assertEquals ( org.springframework.data.solr.core.query.Point , ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) ; Assert . assertEquals ( NUMBER , ( ( Distance ) ( ( java.lang.Object [] ) org.springframework.data.solr.core.query.Predicate . getValue ( ) ) [ NUMBER ] ) . getValue ( ) , NUMBER ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new Criteria ( STRING ) . within ( null , new Distance ( NUMBER ) ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Set<org.springframework.data.solr.core.query.Predicate> < Predicate > java.util.Set<org.springframework.data.solr.core.query.Predicate> , int int , OperationKey org.springframework.data.solr.core.query.OperationKey , java.lang.Object java.lang.Object ) { void ( java.util.Set<org.springframework.data.solr.core.query.Predicate> , int , org.springframework.data.solr.core.query.OperationKey . getKey ( ) , java.lang.Object ) ; }  <METHOD_END>
<METHOD_START> private void void ( java.util.Set<org.springframework.data.solr.core.query.Predicate> < Predicate > java.util.Set<org.springframework.data.solr.core.query.Predicate> , int int , java.lang.String java.lang.String , java.lang.Object java.lang.Object ) { Predicate org.springframework.data.solr.core.query.Predicate = org.springframework.data.solr.core.query.Predicate ( java.util.Set<org.springframework.data.solr.core.query.Predicate> , int ) ; Assert . assertEquals ( java.lang.Object , org.springframework.data.solr.core.query.Predicate . getValue ( ) ) ; Assert . assertEquals ( java.lang.String , org.springframework.data.solr.core.query.Predicate . getKey ( ) ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.data.solr.core.query.Predicate org.springframework.data.solr.core.query.Predicate ( java.util.Set<org.springframework.data.solr.core.query.Predicate> < Predicate > java.util.Set<org.springframework.data.solr.core.query.Predicate> , int int ) { return ( Predicate ) java.util.Set<org.springframework.data.solr.core.query.Predicate> . toArray ( ) [ int ] ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.String java.lang.String ( ) { return STRING ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public java.lang.Iterable<java.lang.Object> < java.lang.Object > java.lang.Iterable<java.lang.Object> ( ) { return null ; }  <METHOD_END>
<METHOD_START> @ java.lang.Override public boolean boolean ( ) { return false ; }  <METHOD_END>
