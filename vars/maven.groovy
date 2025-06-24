def call(List commands){
   for(command in commands){
       sh("mvn ${command}")
   }
}