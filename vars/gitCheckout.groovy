def call(Map stageParams) {
 
    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ credentialsId: stageParams.credentialsId ]]
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }