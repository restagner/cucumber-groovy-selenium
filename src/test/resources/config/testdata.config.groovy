import cucumber.helpers.User

testdata {
    users {
        cheryl = new User(hubId: 'LANGC', password: 'cheryl')
        cheryl.entitlements = ['Bambi', 'Toy Story']

        patrick = new User(hubId: 'SMITP', password: 'patrick')
        patrick.entitlements = ['Frozen', 'Wreck It Ralph']

        jack = new User()
        jack.entitlements = ['Snow White', 'Frozen']
    }
}
