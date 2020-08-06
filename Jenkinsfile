def gv

pipeline {
  agent any
  parameters{
    choice(name :'VERSION', choices :['1.0.1','1.0.2','1.0.3'], description :'This is to show description')
    booleanParam(name : 'executeText', defaultValue :'true', description : '')
  }
    stages{
       stage("init"){
       
         steps{
           script{
           gv = load "script.groovy"
           }
      }
    }
      stage("build"){
       
         steps{
           script{
              gv.buildApp()
           }
      }
    }
    stage("test"){
         script{
              gv.testApp()
           }
    }
    stage("deploy"){
          script{
              gv.deployApp()
           }
    }
}
}
