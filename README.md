# craftdemo

Craft Demo to simulate an application analogous to Google Keep

Main.java - Class to simulate server interaction with client
SheetsManager.java - Class to create a singleton instance for sheets
Sheet.java - Base class to classify Note and ToDoList
Note.java - Child class of Sheet
ToDoList.java - Child class of Sheet
Entry.java - Class that defines entries of within a todolist

Sample response for sheets
{
  "sheets": [
    {
      "id" : 0,
      "title": "wedding",
      "type": "ToDoList",
      "entries": [
        {
            "status": "true",
            "content": "photography"
        },
        {...},
        {...}
      ]
    },
    {
      "id": 1,
      "title": "tips"
      "type": "Note",
      "content": "do something"
    }
  ]
}