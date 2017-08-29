<METHOD_START> public void ( char char , boolean boolean ) { this . char = char ; this . boolean = boolean ; }  <METHOD_END>
<METHOD_START> public org.springframework.web.util.patterns.PathPattern org.springframework.web.util.patterns.PathPattern ( java.lang.String java.lang.String ) { if ( java.lang.String == null ) { java.lang.String = STRING ; } char[] = java.lang.String . char[] ( ) ; int = char[] . int ; org.springframework.web.util.patterns.PathElement = null ; org.springframework.web.util.patterns.PathElement = null ; java.util.List<java.lang.String> = null ; int = - NUMBER ; int = NUMBER ; void ( ) ; while ( int < int ) { char char = char[] [ int ] ; if ( char == char ) { if ( int != - NUMBER ) { void ( org.springframework.web.util.patterns.PathElement ( ) ) ; } while ( ( int + NUMBER ) < int && char[] [ int + NUMBER ] == char ) { int ++ ; } if ( boolean ( ) ) { void ( new WildcardTheRestPathElement ( int , char ) ) ; int += NUMBER ; } else { void ( new SeparatorPathElement ( int , char ) ) ; } } else { if ( int == - NUMBER ) { int = int ; } if ( char == '?' ) { int ++ ; } else if ( char == '{' ) { if ( boolean ) { throw new PatternParseException ( int , char[] , PatternMessage . ILLEGAL_NESTED_CAPTURE ) ; } boolean = true ; int = int ; } else if ( char == '}' ) { if ( ! boolean ) { throw new PatternParseException ( int , char[] , PatternMessage . MISSING_OPEN_CAPTURE ) ; } boolean = false ; if ( boolean && ( int + NUMBER ) < int ) { throw new PatternParseException ( int + NUMBER , char[] , PatternMessage . NO_MORE_DATA_EXPECTED_AFTER_CAPTURE_THE_REST ) ; } int ++ ; } else if ( char == ':' ) { if ( boolean ) { void ( ) ; boolean = false ; int ++ ; } } else if ( char == '*' ) { if ( boolean ) { if ( int == int - NUMBER ) { boolean = true ; } } boolean = true ; } if ( boolean ) { if ( ( int + NUMBER + ( boolean ? NUMBER : NUMBER ) ) == int && ! java.lang.Character . boolean ( char ) ) { throw new PatternParseException ( int , char[] , PatternMessage . ILLEGAL_CHARACTER_AT_START_OF_CAPTURE_DESCRIPTOR , java.lang.Character . java.lang.String ( char ) ) ; } else if ( ( int > ( int + NUMBER + ( boolean ? NUMBER : NUMBER ) ) && ! java.lang.Character . boolean ( char ) ) ) { throw new PatternParseException ( int , char[] , PatternMessage . ILLEGAL_CHARACTER_IN_CAPTURE_DESCRIPTOR , java.lang.Character . java.lang.String ( char ) ) ; } } } int ++ ; } if ( int != - NUMBER ) { void ( org.springframework.web.util.patterns.PathElement ( ) ) ; } return new PathPattern ( java.lang.String , org.springframework.web.util.patterns.PathElement , char , boolean ) ; }  <METHOD_END>
<METHOD_START> private void void ( ) { int ++ ; int int = int ; int int = NUMBER ; boolean boolean = false ; while ( int < int ) { char char = char[] [ int ] ; if ( char == '\\' && ! boolean ) { int ++ ; boolean = true ; continue; } if ( char == '{' && ! boolean ) { int ++ ; } else if ( char == '}' && ! boolean ) { if ( int == NUMBER ) { if ( int == int ) { throw new PatternParseException ( int , char[] , PatternMessage . MISSING_REGEX_CONSTRAINT ) ; } return; } int -- ; } if ( char == char && ! boolean ) { throw new PatternParseException ( int , char[] , PatternMessage . MISSING_CLOSE_CAPTURE ) ; } int ++ ; boolean = false ; } throw new PatternParseException ( int - NUMBER , char[] , PatternMessage . MISSING_CLOSE_CAPTURE ) ; }  <METHOD_END>
<METHOD_START> private boolean boolean ( ) { if ( ( int + NUMBER ) >= int ) { return false ; } if ( char[] [ int + NUMBER ] != '*' || char[] [ int + NUMBER ] != '*' ) { return false ; } return ( int + NUMBER == int ) ; }  <METHOD_END>
<METHOD_START> private void void ( PathElement org.springframework.web.util.patterns.PathElement ) { if ( org.springframework.web.util.patterns.PathElement instanceof CaptureTheRestPathElement ) { if ( org.springframework.web.util.patterns.PathElement == null ) { org.springframework.web.util.patterns.PathElement = org.springframework.web.util.patterns.PathElement ; org.springframework.web.util.patterns.PathElement = org.springframework.web.util.patterns.PathElement ; } else if ( org.springframework.web.util.patterns.PathElement instanceof SeparatorPathElement ) { PathElement org.springframework.web.util.patterns.PathElement = org.springframework.web.util.patterns.PathElement . prev ; if ( org.springframework.web.util.patterns.PathElement == null ) { org.springframework.web.util.patterns.PathElement = org.springframework.web.util.patterns.PathElement ; newPathElement . prev = org.springframework.web.util.patterns.PathElement ; } else { peBeforeSeparator . next = org.springframework.web.util.patterns.PathElement ; newPathElement . prev = org.springframework.web.util.patterns.PathElement ; } org.springframework.web.util.patterns.PathElement = org.springframework.web.util.patterns.PathElement ; } else { throw new java.lang.IllegalStateException ( STRING + org.springframework.web.util.patterns.PathElement ) ; } } else { if ( org.springframework.web.util.patterns.PathElement == null ) { org.springframework.web.util.patterns.PathElement = org.springframework.web.util.patterns.PathElement ; org.springframework.web.util.patterns.PathElement = org.springframework.web.util.patterns.PathElement ; } else { org.springframework.web.util.patterns.PathElement . next = org.springframework.web.util.patterns.PathElement ; newPathElement . prev = org.springframework.web.util.patterns.PathElement ; org.springframework.web.util.patterns.PathElement = org.springframework.web.util.patterns.PathElement ; } } void ( ) ; }  <METHOD_END>
<METHOD_START> private org.springframework.web.util.patterns.PathElement org.springframework.web.util.patterns.PathElement ( ) { if ( boolean ) { throw new PatternParseException ( int , char[] , PatternMessage . MISSING_CLOSE_CAPTURE ) ; } char [] char[] = new char [ int - int ] ; java.lang.System . void ( char[] , int , char[] , NUMBER , int - int ) ; PathElement org.springframework.web.util.patterns.PathElement = null ; if ( int > NUMBER ) { if ( int == NUMBER && int == int && char[] [ int - NUMBER ] == '}' ) { if ( boolean ) { org.springframework.web.util.patterns.PathElement = new CaptureTheRestPathElement ( int , char[] , char ) ; } else { try { org.springframework.web.util.patterns.PathElement = new CaptureVariablePathElement ( int , char[] , boolean , char ) ; } catch ( java.util.regex.PatternSyntaxException java.util.regex.PatternSyntaxException ) { throw new PatternParseException ( java.util.regex.PatternSyntaxException , int ( char[] , int ) + java.util.regex.PatternSyntaxException . int ( ) , char[] , PatternMessage . JDK_PATTERN_SYNTAX_EXCEPTION ) ; } void ( int , ( ( CaptureVariablePathElement ) org.springframework.web.util.patterns.PathElement ) . getVariableName ( ) ) ; } } else { if ( boolean ) { throw new PatternParseException ( int , char[] , PatternMessage . CAPTURE_ALL_IS_STANDALONE_CONSTRUCT ) ; } RegexPathElement org.springframework.web.util.patterns.RegexPathElement = new RegexPathElement ( int , char[] , boolean , char[] , char ) ; for ( java.lang.String java.lang.String : org.springframework.web.util.patterns.RegexPathElement . getVariableNames ( ) ) { void ( int , java.lang.String ) ; } org.springframework.web.util.patterns.PathElement = org.springframework.web.util.patterns.RegexPathElement ; } } else { if ( boolean ) { if ( int - NUMBER == int ) { org.springframework.web.util.patterns.PathElement = new WildcardPathElement ( int , char ) ; } else { org.springframework.web.util.patterns.PathElement = new RegexPathElement ( int , char[] , boolean , char[] , char ) ; } } else if ( int != NUMBER ) { org.springframework.web.util.patterns.PathElement = new SingleCharWildcardedPathElement ( int , char[] , int , boolean , char ) ; } else { org.springframework.web.util.patterns.PathElement = new LiteralPathElement ( int , char[] , boolean , char ) ; } } return org.springframework.web.util.patterns.PathElement ; }  <METHOD_END>
<METHOD_START> private int int ( char [] char[] , int int ) { int int = int ; while ( int < char[] . int ) { if ( char[] [ int ] == ':' ) { return int + NUMBER ; } int ++ ; } return - NUMBER ; }  <METHOD_END>
<METHOD_START> private void void ( ) { int = - NUMBER ; int = NUMBER ; boolean = false ; int = NUMBER ; boolean = false ; boolean = false ; int = - NUMBER ; }  <METHOD_END>
<METHOD_START> private void void ( int int , java.lang.String java.lang.String ) { if ( java.util.List<java.lang.String> == null ) { java.util.List<java.lang.String> = new java.util.ArrayList<java.lang.String> <> ( ) ; } if ( java.util.List<java.lang.String> . boolean ( java.lang.String ) ) { throw new PatternParseException ( int , this . char[] , PatternMessage . ILLEGAL_DOUBLE_CAPTURE , java.lang.String ) ; } java.util.List<java.lang.String> . boolean ( java.lang.String ) ; }  <METHOD_END>
