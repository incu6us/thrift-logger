namespace java com.github.incu6us.thrifttest

struct Args{
	1: optional string id
	2: required string name
	3: string text
}

struct Result{
	1: optional bool isSuccess
	2: string data
}

service UglyService{
	Result doSomething(1: Args tArgs)
}
