def buildApp(){
echo "I am a build stage"
}
def testApp(){
echo "I am a test stage"
}
def deployApp(){
echo "I am a deploy stage"
echo "Deploying Version ${params.VERSION}"
}

return this
