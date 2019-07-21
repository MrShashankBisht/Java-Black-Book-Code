new File("sample.txt").withReader { reader ->
	while (true) { def line = reader.readLine()
		if(line==null)
		break
		println line } }
