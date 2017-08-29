<METHOD_START> @ Before public void void ( ) { this . org.springframework.data.querydsl.binding.QuerydslPredicateBuilder = new QuerydslPredicateBuilder ( new DefaultFormattingConversionService ( ) , SimpleEntityPathResolver . INSTANCE ) ; this . org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> = new LinkedMultiValueMap <> ( ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { new QuerydslPredicateBuilder ( null , SimpleEntityPathResolver . INSTANCE ) ; }  <METHOD_END>
<METHOD_START> @ Test ( expected = java.lang.IllegalArgumentException .class ) public void void ( ) { org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( null , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , null ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { assertThat ( org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( ClassTypeInformation . OBJECT , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ) . isNull ( ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; Predicate org.springframework.data.querydsl.binding.Predicate = org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ; assertThat ( org.springframework.data.querydsl.binding.Predicate ) . isEqualTo ( ( Predicate ) QUser . user . firstname . eq ( STRING ) ) ; java.util.List<org.springframework.data.querydsl.binding.User> < User > java.util.List<org.springframework.data.querydsl.binding.User> = CollQueryFactory . from ( QUser . user , Users . USERS ) . where ( org.springframework.data.querydsl.binding.Predicate ) . fetchResults ( ) . getResults ( ) ; assertThat ( java.util.List<org.springframework.data.querydsl.binding.User> ) . containsExactly ( Users . OLIVER ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.lang.Exception { org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; Predicate org.springframework.data.querydsl.binding.Predicate = org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ; assertThat ( org.springframework.data.querydsl.binding.Predicate ) . isEqualTo ( QUser . user . address . city . eq ( STRING ) ) ; java.util.List<org.springframework.data.querydsl.binding.User> < User > java.util.List<org.springframework.data.querydsl.binding.User> = CollQueryFactory . from ( QUser . user , Users . USERS ) . where ( org.springframework.data.querydsl.binding.Predicate ) . fetchResults ( ) . getResults ( ) ; assertThat ( java.util.List<org.springframework.data.querydsl.binding.User> ) . containsExactly ( Users . CHRISTOPH ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING . java.lang.String ( ) , STRING ) ; Predicate org.springframework.data.querydsl.binding.Predicate = org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ; assertThat ( org.springframework.data.querydsl.binding.Predicate ) . isEqualTo ( QUser . user . firstname . eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , null ) ; QuerydslBindings org.springframework.data.querydsl.binding.QuerydslBindings = new QuerydslBindings ( ) ; org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . lastname ) . firstOptional ( ( path , value ) -> value . map ( path :: contains ) ) ; org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; Predicate org.springframework.data.querydsl.binding.Predicate = org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ; Constant < java.lang.Object > org.springframework.data.querydsl.binding.Constant<java.lang.Object> = ( Constant < java.lang.Object > ) ( ( java.util.List<?> < ? > ) getField ( getField ( org.springframework.data.querydsl.binding.Predicate , STRING ) , STRING ) ) . get ( NUMBER ) ; assertThat ( org.springframework.data.querydsl.binding.Constant<java.lang.Object> . getConstant ( ) ) . isEqualTo ( new java.lang.Double [] { NUMBER , - NUMBER } ) ; }  <METHOD_END>
<METHOD_START> @ Test @ java.lang.SuppressWarnings ( STRING ) public void void ( ) { org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; Predicate org.springframework.data.querydsl.binding.Predicate = org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ; Constant < java.lang.Object > org.springframework.data.querydsl.binding.Constant<java.lang.Object> = ( Constant < java.lang.Object > ) ( ( java.util.List<?> < ? > ) getField ( getField ( org.springframework.data.querydsl.binding.Predicate , STRING ) , STRING ) ) . get ( NUMBER ) ; assertThat ( org.springframework.data.querydsl.binding.Constant<java.lang.Object> . getConstant ( ) ) . isEqualTo ( STRING ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) java.text.ParseException { DateTimeFormatter org.springframework.data.querydsl.binding.DateTimeFormatter = DateTimeFormat . forPattern ( STRING ) ; java.lang.String java.lang.String = org.springframework.data.querydsl.binding.DateTimeFormatter . print ( new DateTime ( ) ) ; org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , org.springframework.data.querydsl.binding.DateTimeFormatter . print ( new DateTime ( ) ) ) ; Predicate org.springframework.data.querydsl.binding.Predicate = org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ; assertThat ( org.springframework.data.querydsl.binding.Predicate ) . isEqualTo ( QUser . user . dateOfBirth . eq ( org.springframework.data.querydsl.binding.DateTimeFormatter . parseDateTime ( java.lang.String ) . toDate ( ) ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; Predicate org.springframework.data.querydsl.binding.Predicate = org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ; assertThat ( org.springframework.data.querydsl.binding.Predicate ) . isEqualTo ( QUser . user . addresses . any ( ) . street . eq ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; QuerydslBindings org.springframework.data.querydsl.binding.QuerydslBindings = new QuerydslBindings ( ) ; org.springframework.data.querydsl.binding.QuerydslBindings . bind ( QUser . user . as ( QSpecialUser .class ) . specialProperty ) . first ( QuerydslBindingsUnitTests . ContainsBinding . INSTANCE ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ) . isEqualTo ( QUser . user . as ( QSpecialUser .class ) . specialProperty . contains ( STRING ) ) ; }  <METHOD_END>
<METHOD_START> @ Test public void void ( ) { org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> . add ( STRING , STRING ) ; QUserWrapper org.springframework.data.querydsl.binding.QUserWrapper = QUserWrapper . userWrapper ; QuerydslBindings org.springframework.data.querydsl.binding.QuerydslBindings = new QuerydslBindings ( ) ; org.springframework.data.querydsl.binding.QuerydslBindings . bind ( $ . user . as ( QSpecialUser .class ) . specialProperty ) . first ( QuerydslBindingsUnitTests . ContainsBinding . INSTANCE ) ; assertThat ( org.springframework.data.querydsl.binding.QuerydslPredicateBuilder . getPredicate ( org.springframework.data.querydsl.binding.ClassTypeInformation<org.springframework.data.querydsl.binding.User> , org.springframework.data.querydsl.binding.MultiValueMap<java.lang.String,java.lang.String> , org.springframework.data.querydsl.binding.QuerydslBindings ) ) . isEqualTo ( $ . user . as ( QSpecialUser .class ) . specialProperty . contains ( STRING ) ) ; }  <METHOD_END>