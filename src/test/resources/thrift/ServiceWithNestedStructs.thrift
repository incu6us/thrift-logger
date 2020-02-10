namespace java com.github.incu6us.thrifttestnested

struct Args{
	1: optional string id
	2: required string name
	3: string text
}

struct NestedResult{
    1: string netedData
}

struct Result{
	1: optional bool isSuccess
	2: string data
	3: NestedResult nested
}

service UglyService{
	Result doSomething(1: Args tArgs)
}
