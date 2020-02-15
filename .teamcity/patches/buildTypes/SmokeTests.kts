package patches.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the buildType with id = 'SmokeTests'
accordingly, and delete the patch script.
*/
changeBuildType(RelativeId("SmokeTests")) {
    expectSteps {
        script {
            workingDir = "examples"
            scriptContent = """
                #!/bin/bash
                set -e -x
                
                cd cra-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../cra-ts-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../vue-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../svelte-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../angular-cli
                yarn storybook --smoke-test --quiet
                
                cd ../ember-cli
                yarn storybook --smoke-test --quiet
                
                cd ../marko-cli
                yarn storybook --smoke-test --quiet
                
                cd ../official-storybook
                yarn storybook --smoke-test --quiet
                
                cd ../mithril-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../riot-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../preact-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../cra-react15
                yarn storybook --smoke-test --quiet
            """.trimIndent()
            dockerImage = "node:lts"
            dockerImagePlatform = ScriptBuildStep.ImagePlatform.Linux
        }
    }
    steps {
        update<ScriptBuildStep>(0) {
            workingDir = ""
            scriptContent = """
                #!/bin/bash
                set -e -x
                
                yarn install
                
                cd examples/cra-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../cra-ts-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../vue-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../svelte-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../angular-cli
                yarn storybook --smoke-test --quiet
                
                cd ../ember-cli
                yarn storybook --smoke-test --quiet
                
                cd ../marko-cli
                yarn storybook --smoke-test --quiet
                
                cd ../official-storybook
                yarn storybook --smoke-test --quiet
                
                cd ../mithril-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../riot-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../preact-kitchen-sink
                yarn storybook --smoke-test --quiet
                
                cd ../cra-react15
                yarn storybook --smoke-test --quiet
            """.trimIndent()
        }
    }
}