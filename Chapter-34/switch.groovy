def myVar=6
switch ( myVar ) {
	case "kogent":
	println "Kogent"
	case "Prakash":
	println "Prakash"
	case [2, 6, 8, 'Lucy']:
	println "Matched with List element"
	break
	case 1..10:
	println "Fall into this Range"
	break
	case Integer:
	println "This is an Integer"
	break
	case Number:
	println "This is a Number"
	break
	default:
	println "Default"
}
