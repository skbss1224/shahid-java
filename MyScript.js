var myArray=[
    {
        "name":"sasi",
        "exp":4,
        "current":"RealBuddy",
        "status":"active"
    },
    {
        "name":"mani",
        "exp":4,
        "current":"RealBuddy",
        "status":"active"
    },
    {
        "name":"shahid",
        "exp":3,
        "current":"RealBuddy",
        "status":"active"
    }
]

const deleting=(index)=>{
    alert(index+" caught @ delete ")
    myArray=myArray.filter((ele,pos)=>{
        return pos!==index
    })
    listing()
}

const listing=()=>{
    var data=""
    
    myArray.map((ele,pos)=>{
        data+="<tr>"
        data+="<td>"+ele.name+"</td>"
        data+="<td>"+ele.exp+"</td>"
        data+="<td>"+ele.current+"</td>"
        data+="<td>"+ele.status+"</td>"
        data+="<td><button class='btn btn-outline-danger' onclick='deleting("+pos+")'>Delete</button></td>"
        data+="</tr>"
    })
    
    document.getElementById('content').innerHTML=data
}