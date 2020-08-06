pipeline {
  agent any
  parameters{
    string(name :'VERSION', choices :['1.0.1','1.0.2','1.0.3'], description :'This is to show description')
    booleanParam(name : 'executeText', defaultValue :'true')
  }
    stages{
      stage("build"){
        when{
          expression{
          param.executeTest
          }
        }
         steps{
            echo "This is build stage"
      }
    }
    stage("test"){
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
