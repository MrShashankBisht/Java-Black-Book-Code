def filename="sample.txt"
def file=new File(filename)
println "Reading from the file ${file}...\n\n"
//Iterating over the lines in the file.
file.eachLine { line -> println(line) }
//Appending text in the file.
file.append("//This is the text added.")
println "Reading from the file ${file} after text addition...\n\n"
file.eachLine { line -> println(line) }
