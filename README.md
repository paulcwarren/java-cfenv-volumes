# java-cfenv-volumes
Sample project to demonstrate volume services support in the new java-cfenv project

Add the following environment variables to you run configuration:

*VCAP_APPLICATION:*

```
{
  "application_id": "fa05c1a9-0fc1-4fbd-bae1-139850dec7a3",
  "instance_id": "fe98dc76ba549876543210abcd1234",
  "instance_index": 0,
  "host": "0.0.0.0",
  "port": 61857,
  "started_at": "2013-08-12 00:05:29 +0000",
  "started_at_timestamp": 1376265929,
  "start": "2013-08-12 00:05:29 +0000",
  "state_timestamp": 1376265929,
  "limits": {
    "mem": 512,
    "disk": 1024,
    "fds": 16384
  },
  "cf_api": "https://api.example.com",
  "application_version": "ab12cd34-5678-abcd-0123-abcdef987654",
  "application_name": "styx-james",
  "application_uris": [
    "my-app.example.com"
  ],
  "version": "ab12cd34-5678-abcd-0123-abcdef987654",
  "name": "my-app",
  "space_id": "06450c72-4669-4dc6-8096-45f9777db68a",
  "space_name": "my-space",
  "uris": [
    "my-app.example.com"
  ],
  "users": null
}
```

*VCAP_SERVICES:*

```
{
  "p-mysql": [
    {
      "credentials": {
        "hostname": "10.0.4.35",
        "port": 3306,
        "name": "mysql_name",
        "username": "mysql_username",
        "password": "mysql_password",
        "uri": "mysql://mysql_username:mysql_password@10.0.4.35:3306/cf_2e23d10a_8738_8c3c_66cf_13e44422698c?reconnect=true",
        "jdbcUrl": "jdbc:mysql://10.0.4.35:3306/cf_2e23d10a_8738_8c3c_66cf_13e44422698c?user=mysql_username&password=mysql_password"
      },
      "syslog_drain_url": null,
      "volume_mounts": [],
      "label": "p-mysql",
      "provider": null,
      "plan": "100mb",
      "name": "mysql",
      "tags": [
        "mysql",
        "relational"
      ]
    }
  ],
  "p-redis": [
    {
      "credentials": {
        "host": "10.0.4.30",
        "password": "redis_password",
        "port": 45470
      },
      "syslog_drain_url": null,
      "volume_mounts": [],
      "label": "p-redis",
      "provider": null,
      "plan": "shared-vm",
      "binding_name": "redis-binding",
      "tags": [
        "pivotal",
        "redis"
      ]
    }
  ],
  "nfs": [
    {
      "binding_name": null,
      "credentials": {},
      "instance_name": "nfs1",
      "label": "nfs",
      "name": "nfs1",
      "plan": "Existing",
      "provider": null,
      "syslog_drain_url": null,
      "tags": [
        "nfs"
      ],
      "volume_mounts": [
        {
          "container_dir": "/var/vcap/data/78525ee7-196c-4ed4-8ac6-857d15334631",
          "device_type": "shared",
          "mode": "rw"
        }
      ]
    }
  ]
}
```

Then run `contextLoads` test in `tests`
