pipeline {
  agent any
  parameters{
    choice(name :'VERSION', choices :['1.0.1','1.0.2','1.0.3'], description :'This is to show description')
    booleanParam(name : 'executeText', defaultValue :'true' description : '')
  }
    stages{
      stage("build"){
       
         steps{
            echo "This is build stage"
      }
    }
    stage("test"){
       when {
          expression {
          param.executeTest
          }
        }
         steps{
            echo "This is build stage"
      }
    }
    stage("deploy"){
         steps{
            echo "This is build stage"
           echo "this is version ${param.VERSION}"
      }
    }
}
}
